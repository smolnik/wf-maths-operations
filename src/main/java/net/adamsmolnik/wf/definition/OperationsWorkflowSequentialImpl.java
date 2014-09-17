package net.adamsmolnik.wf.definition;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import net.adamsmolnik.activities.maths.OperationActivitiesClient;
import net.adamsmolnik.activities.maths.OperationActivitiesClientImpl;
import net.adamsmolnik.activities.util.ResultActivitiesClient;
import net.adamsmolnik.activities.util.ResultActivitiesClientImpl;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Promises;

/**
 * @author ASmolnik
 *
 */
public class OperationsWorkflowSequentialImpl implements OperationsWorkflowSequential {

    private OperationActivitiesClient opsClient = new OperationActivitiesClientImpl();

    private ResultActivitiesClient resultClient = new ResultActivitiesClientImpl();

    @Override
    public Promise<Double> execute(double a, double b) {
        Promise<String> processId = Promise.asPromise(ManagementFactory.getRuntimeMXBean().getName());

        Promise<Double> addResult = opsClient.add(a, b);
        Promise<Double> subtractResult = opsClient.subtract(a, b, addResult);
        Promise<Double> multiplResult = opsClient.multiply(a, b, subtractResult);
        Promise<Double> divideResult = opsClient.divide(a, b, multiplResult);

        List<Promise<Double>> addends = new ArrayList<>();
        addends.add(addResult);
        addends.add(subtractResult);
        addends.add(multiplResult);
        addends.add(divideResult);

        Promise<List<Double>> addendsAsPromise = Promises.listOfPromisesToPromise(addends);
        Promise<Double> sumResults = opsClient.sum(addendsAsPromise);
        resultClient.display(Promise.asPromise("wfResult"), sumResults, processId);
        return sumResults;
    }

}
