package net.adamsmolnik.wf.definition;

import net.adamsmolnik.activities.maths.OperationActivitiesClient;
import net.adamsmolnik.activities.maths.OperationActivitiesClientImpl;
import net.adamsmolnik.activities.util.ResultActivitiesClient;
import net.adamsmolnik.activities.util.ResultActivitiesClientImpl;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

/**
 * @author ASmolnik
 *
 */
public class OperationsWorkflowSequentialImpl implements OperationsWorkflowSequential {

    private OperationActivitiesClient opsClient = new OperationActivitiesClientImpl();

    private ResultActivitiesClient resultClient = new ResultActivitiesClientImpl();

    @Override
    public Promise<Double> execute(double a, double b) {
        /*
        * Complete code here
        */
        Promise<Double> sumResults = null;
        return sumResults;
    }

}
