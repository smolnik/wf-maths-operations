package net.adamsmolnik.wf.client;

import java.util.concurrent.TimeUnit;
import net.adamsmolnik.wf.definition.OperationsWorkflowMixClientExternal;
import net.adamsmolnik.wf.definition.OperationsWorkflowMixClientExternalFactoryImpl;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClient;

/**
 * @author ASmolnik
 *
 */
public class WfClient {

    public static void main(String[] args) throws Exception {
        ClientConfiguration config = new ClientConfiguration().withSocketTimeout(70 * 1000);
        AmazonSimpleWorkflow service = new AmazonSimpleWorkflowClient(config);
        service.setEndpoint("https://swf.us-east-1.amazonaws.com");
        String domain = "student100";
        OperationsWorkflowMixClientExternal client = new OperationsWorkflowMixClientExternalFactoryImpl(service, domain).getClient();
        client.execute(4, 2);
        TimeUnit.SECONDS.sleep(10);
    }

}
