package net.adamsmolnik.wf.definition;

import static com.amazonaws.services.simpleworkflow.flow.junit.AsyncAssert.assertEquals;
import net.adamsmolnik.activities.maths.OperationActivitiesImpl;
import net.adamsmolnik.activities.util.ResultActivitiesImpl;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.junit.FlowBlockJUnit4ClassRunner;
import com.amazonaws.services.simpleworkflow.flow.junit.WorkflowTest;

/**
 * @author ASmolnik
 *
 */
@RunWith(FlowBlockJUnit4ClassRunner.class)
public class OperationsWorkflowMixTest {

    @Rule
    public WorkflowTest workflowTest = new WorkflowTest();

    OperationsWorkflowMixClientFactory workflowFactory = new OperationsWorkflowMixClientFactoryImpl();

    @Before
    public void setUp() throws Exception {
        workflowTest.addActivitiesImplementation(new OperationActivitiesImpl());
        workflowTest.addActivitiesImplementation(new ResultActivitiesImpl());
        workflowTest.addWorkflowImplementationType(OperationsWorkflowMixImpl.class);
    }

    @Test
    public void runWf() {
        OperationsWorkflowMixClient workflow = workflowFactory.getClient();
        Promise<Double> result = workflow.execute(4, 2);
        // assertEquals("runWf", Double.valueOf(15), result);
    }

}
