package net.adamsmolnik.activities.util;

/**
 * @author ASmolnik
 *
 */
import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;

@ActivityRegistrationOptions(defaultTaskScheduleToStartTimeoutSeconds = 300, defaultTaskStartToCloseTimeoutSeconds = 10)
@Activities(version = ResultActivitiesVersion.VERSION)
public interface ResultActivities {

    void display(String message, double result, String processId);
}
