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
public class OperationsWorkflowMixedTest {

    @Rule
    public WorkflowTest workflowTest = new WorkflowTest();

    OperationsWorkflowMixedClientFactory workflowFactory = new OperationsWorkflowMixedClientFactoryImpl();

    @Before
    public void setUp() throws Exception {
        workflowTest.addActivitiesImplementation(new OperationActivitiesImpl());
        workflowTest.addActivitiesImplementation(new ResultActivitiesImpl());
        workflowTest.addWorkflowImplementationType(OperationsWorkflowMixedImpl.class);
    }

    @Test
    public void runWf() {
        OperationsWorkflowMixedClient workflow = workflowFactory.getClient();
        Promise<Double> result = workflow.execute(4, 2);
        assertEquals("runWf", Double.valueOf(15), result);
    }

}
