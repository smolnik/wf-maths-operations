package net.adamsmolnik.activities.maths;

import java.util.List;
import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;

/**
 * @author ASmolnik
 *
 */
@ActivityRegistrationOptions(defaultTaskScheduleToStartTimeoutSeconds = 300, defaultTaskStartToCloseTimeoutSeconds = 30)
@Activities(version = OpsActivitiesVersion.VERSION)
public interface OperationActivities {

    double add(double a, double b);

    double subtract(double a, double b);

    double multiply(double a, double b);

    double divide(double a, double b);

    double sum(List<Double> addends);

}
