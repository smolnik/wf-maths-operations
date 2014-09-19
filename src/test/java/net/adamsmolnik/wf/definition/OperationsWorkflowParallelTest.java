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
public class OperationsWorkflowParallelTest {

    @Rule
    public WorkflowTest workflowTest = new WorkflowTest();

    OperationsWorkflowParallelClientFactory workflowFactory = new OperationsWorkflowParallelClientFactoryImpl();

    @Before
    public void setUp() throws Exception {
        workflowTest.addActivitiesImplementation(new OperationActivitiesImpl());
        workflowTest.addActivitiesImplementation(new ResultActivitiesImpl());
        workflowTest.addWorkflowImplementationType(OperationsWorkflowParallelImpl.class);
    }

    @Test
    public void runWf() {
        OperationsWorkflowParallelClient workflow = workflowFactory.getClient();
        Promise<Double> result = workflow.execute(3, 4);
        assertEquals("runWf", Double.valueOf(18.75), result);
    }

}
