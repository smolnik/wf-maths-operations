package net.adamsmolnik.wf.setup;

import net.adamsmolnik.activities.maths.OperationActivitiesImpl;
import net.adamsmolnik.activities.maths.OpsActivitiesVersion;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;
import com.amazonaws.services.simpleworkflow.flow.ActivityWorker;

/**
 * @author ASmolnik
 *
 */
public class OperationsActivitiesLauncher {

    public static void main(String[] args) throws Exception {
        ClientConfiguration config = new ClientConfiguration().withSocketTimeout(70 * 1000);
        AmazonSimpleWorkflow service = new AmazonSimpleWorkflowClient(config);
        service.setEndpoint("https://swf.us-east-1.amazonaws.com");
        ActivityWorker acw = new ActivityWorker(service, Domain.NAME, "mixTasks_" + OpsActivitiesVersion.VERSION);
        acw.addActivitiesImplementation(new OperationActivitiesImpl());
        acw.start();
    }

}
