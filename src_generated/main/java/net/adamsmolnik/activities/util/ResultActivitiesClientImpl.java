/**
 * This code was generated from {@link net.adamsmolnik.activities.util.ResultActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.activities.util;

import com.amazonaws.services.simpleworkflow.flow.ActivitiesClientBase;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class ResultActivitiesClientImpl extends ActivitiesClientBase implements ResultActivitiesClient {

	public ResultActivitiesClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public ResultActivitiesClientImpl(GenericActivityClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }
    
    public ResultActivitiesClientImpl(GenericActivityClient genericClient, 
            DataConverter dataConverter, ActivitySchedulingOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }
    
    @Override
    public final Promise<Void> display(java.lang.String message, double result, java.lang.String processId) {
        return displayImpl(Promise.asPromise(message), Promise.asPromise(result), Promise.asPromise(processId), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Void> display(java.lang.String message, double result, java.lang.String processId, Promise<?>... waitFor) {
        return displayImpl(Promise.asPromise(message), Promise.asPromise(result), Promise.asPromise(processId), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Void> display(java.lang.String message, double result, java.lang.String processId, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return displayImpl(Promise.asPromise(message), Promise.asPromise(result), Promise.asPromise(processId), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Void> display(Promise<java.lang.String> message, Promise<Double> result, Promise<java.lang.String> processId) {
        return displayImpl(message, result, processId, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Void> display(Promise<java.lang.String> message, Promise<Double> result, Promise<java.lang.String> processId, Promise<?>... waitFor) {
        return displayImpl(message, result, processId, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Void> display(Promise<java.lang.String> message, Promise<Double> result, Promise<java.lang.String> processId, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return displayImpl(message, result, processId, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Void> displayImpl(final Promise<java.lang.String> message, final Promise<Double> result, final Promise<java.lang.String> processId, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("ResultActivities.display");
		activityType.setVersion("1.0.1");

        Promise[] _input_ = new Promise[3];
        _input_[0] = message;
        _input_[1] = result;
        _input_[2] = processId;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Void.class, waitFor);
    }

}