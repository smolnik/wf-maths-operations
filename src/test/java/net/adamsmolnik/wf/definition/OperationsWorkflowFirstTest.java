package net.adamsmolnik.wf.definition;

import static com.amazonaws.services.simpleworkflow.flow.junit.AsyncAssert.*;
import net.adamsmolnik.activities.maths.OperationActivitiesImpl;
import net.adamsmolnik.activities.util.ResultActivitiesImpl;
import net.adamsmolnik.wf.definition.OperationsWorkflowFirstClient;
import net.adamsmolnik.wf.definition.OperationsWorkflowFirstClientFactory;
import net.adamsmolnik.wf.definition.OperationsWorkflowFirstClientFactoryImpl;
import net.adamsmolnik.wf.definition.OperationsWorkflowFirstImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.junit.FlowBlockJUnit4ClassRunner;
import com.amazonaws.services.simpleworkflow.flow.junit.WorkflowTest;

@RunWith(FlowBlockJUnit4ClassRunner.class)
public class OperationsWorkflowFirstTest {

    @Rule
    public WorkflowTest workflowTest = new WorkflowTest();

    OperationsWorkflowFirstClientFactory workflowFactory = new OperationsWorkflowFirstClientFactoryImpl();

    @Before
    public void setUp() throws Exception {
        workflowTest.addActivitiesImplementation(new OperationActivitiesImpl());
        workflowTest.addActivitiesImplementation(new ResultActivitiesImpl());
        workflowTest.addWorkflowImplementationType(OperationsWorkflowFirstImpl.class);
    }

    @Test
    public void runWf() {
        OperationsWorkflowFirstClient workflow = workflowFactory.getClient();
        Promise<Double> result = workflow.execute(4, 2);
        assertEquals("runWf", Double.valueOf(15), result);
    }

}
