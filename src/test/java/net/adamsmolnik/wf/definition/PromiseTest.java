package net.adamsmolnik.wf.definition;

import static com.amazonaws.services.simpleworkflow.flow.junit.AsyncAssert.assertNotReady;
import java.util.concurrent.TimeUnit;
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
public class PromiseTest {

    @Rule
    public WorkflowTest workflowTest = new WorkflowTest();

    OperationsWorkflowMixClientFactory workflowFactory = new OperationsWorkflowMixClientFactoryImpl();

    @Before
    public void setUp() throws Exception {
        workflowTest.addActivitiesImplementation(new OperationActivitiesImpl());
        workflowTest.addActivitiesImplementation(new ResultActivitiesImpl() {
            @Override
            public void display(String message, double result, String processId) {
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    // deliberately ignored
                }
                super.display(message, result, processId);
            }
        });
        workflowTest.addWorkflowImplementationType(OperationsWorkflowMixImpl.class);
    }

    @Test(expected = IllegalStateException.class)
    public void fetchResultTooEarly() {
        OperationsWorkflowMixClient workflow = workflowFactory.getClient();
        Promise<Double> result = workflow.execute(5, 2);
        assertNotReady(result);
        org.junit.Assert.assertFalse("should not be ready yet", result.isReady());
        double value = result.get();
        System.out.println("value = " + value);
    }

}
