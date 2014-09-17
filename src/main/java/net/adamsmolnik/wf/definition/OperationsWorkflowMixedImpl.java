package net.adamsmolnik.wf.definition;

import static com.amazonaws.services.simpleworkflow.flow.core.Promise.asPromise;
import java.lang.management.ManagementFactory;
import net.adamsmolnik.activities.maths.OperationActivitiesClient;
import net.adamsmolnik.activities.maths.OperationActivitiesClientImpl;
import net.adamsmolnik.activities.util.ResultActivitiesClient;
import net.adamsmolnik.activities.util.ResultActivitiesClientImpl;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

/**
 * @author ASmolnik
 *
 */
public class OperationsWorkflowMixedImpl implements OperationsWorkflowMixed {

    private OperationActivitiesClient opsClient = new OperationActivitiesClientImpl();

    private ResultActivitiesClient resultClient = new ResultActivitiesClientImpl();

    /**
     * Flow: <br>
     * <pre>
     * 1) parallel {
     *      asynch: addResult = add(a, b)
     *      asynch: subtractResult = subtract(a, b)
     * } 
     * 2) waitForAll (addResult, subtractResult) then parallel {
     *      synch: display
     *      asynch: multiplyOfPriorResults = multiply(addResult, subtractResult)
     *      asynch: divideOfPriorResults = divide(addResult, subtractResult)
     * }  
     * 3) waitForAll (multiplyOfPriorResults, divideOfPriorResults) then {
     *      synch: display
     *      asynch: finalResult = add(multiplyOfPriorResults, divideOfPriorResults)
     * }
     * 4) waitForAll (finalResult) then {
     *      synch: display
     * }
     * </pre>
     * 
     */
    @Override
    public Promise<Double> execute(double a, double b) {
        Promise<String> processId = asPromise(ManagementFactory.getRuntimeMXBean().getName());
        Promise<Double> addResult = opsClient.add(a, b);
        Promise<Double> subtractResult = opsClient.subtract(a, b);

        resultClient.display(asPromise("addResult"), addResult, processId);
        resultClient.display(asPromise("subtractResult"), subtractResult, processId);

        Promise<Double> multiplyOfPriorResults = opsClient.multiply(addResult, subtractResult);
        Promise<Double> divideOfPriorResults = opsClient.divide(addResult, subtractResult);

        resultClient.display(asPromise("multiplyOfPriorResults"), multiplyOfPriorResults, processId);
        resultClient.display(asPromise("divideOfPriorResults"), divideOfPriorResults, processId);

        Promise<Double> wfResult = opsClient.add(multiplyOfPriorResults, divideOfPriorResults);
        resultClient.display(asPromise("wfResult"), wfResult, processId);
        return wfResult;
    }

}
