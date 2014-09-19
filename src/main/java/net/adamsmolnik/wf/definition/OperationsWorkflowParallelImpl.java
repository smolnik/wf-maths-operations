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
public class OperationsWorkflowParallelImpl implements OperationsWorkflowParallel {

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
