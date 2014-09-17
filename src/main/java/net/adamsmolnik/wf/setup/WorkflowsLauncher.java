package net.adamsmolnik.wf.setup;

import net.adamsmolnik.wf.definition.OperationsWorkflowMixedImpl;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.WorkflowWorker;

/**
 * @author ASmolnik
 *
 */
public class WorkflowsLauncher {

    public static void main(String[] args) throws Exception {
        ClientConfiguration config = new ClientConfiguration().withSocketTimeout(70 * 1000);
        AmazonSimpleWorkflow service = new AmazonSimpleWorkflowClient(config);
        service.setEndpoint("https://swf.us-east-1.amazonaws.com");
        WorkflowWorker wfw = new WorkflowWorker(service, "net.adamsmolnik", "wfTasksFirst");
        wfw.addWorkflowImplementationType(OperationsWorkflowMixedImpl.class);
        wfw.start();
    }

}
