package net.adamsmolnik.wf.definition;

import static com.amazonaws.services.simpleworkflow.flow.core.Promise.asPromise;
import java.lang.management.ManagementFactory;
import net.adamsmolnik.activities.maths.OperationsClient;
import net.adamsmolnik.activities.maths.OperationsClientImpl;
import net.adamsmolnik.activities.util.ResultClient;
import net.adamsmolnik.activities.util.ResultClientImpl;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

/**
 * @author ASmolnik
 *
 */
public class OperationsWorkflowFirstImpl implements OperationsWorkflowFirst {

    private OperationsClient opsClient = new OperationsClientImpl();

    private ResultClient resultClient = new ResultClientImpl();

    @Override
    public void execute(double a, double b) {
        Promise<Double> addResult = opsClient.add(a, b);
        Promise<Double> subtractResult = opsClient.subtract(a, b);

        Promise<String> processId = asPromise(ManagementFactory.getRuntimeMXBean().getName());
        Promise<Long> threadId = asPromise(Thread.currentThread().getId());

        resultClient.display(asPromise("addResult"), addResult, processId, threadId);
        resultClient.display(asPromise("subtractResult"), subtractResult, processId, threadId);

        Promise<Double> multiplyOfPriorResults = opsClient.multiply(addResult, subtractResult, processId, threadId);
        resultClient.display(asPromise("multiplyOfPriorResults"), multiplyOfPriorResults, processId, threadId);
    }

}
