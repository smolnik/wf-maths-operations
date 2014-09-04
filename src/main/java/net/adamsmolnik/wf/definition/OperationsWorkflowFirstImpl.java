package net.adamsmolnik.wf.definition;

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

        resultClient.display(Promise.asPromise("addResult = "), addResult);
        resultClient.display(Promise.asPromise("subtractResult = "), subtractResult);

        Promise<Double> multiplyOfPriorResults = opsClient.multiply(addResult, subtractResult);
        resultClient.display(Promise.asPromise("multiplyOfPriorResults"), multiplyOfPriorResults);
    }

}
