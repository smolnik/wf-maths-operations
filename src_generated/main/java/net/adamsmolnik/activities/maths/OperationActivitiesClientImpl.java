/**
 * This code was generated from {@link net.adamsmolnik.activities.maths.OperationActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.activities.maths;

import com.amazonaws.services.simpleworkflow.flow.ActivitiesClientBase;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericActivityClient;
import com.amazonaws.services.simpleworkflow.model.ActivityType;

public class OperationActivitiesClientImpl extends ActivitiesClientBase implements OperationActivitiesClient {

	public OperationActivitiesClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public OperationActivitiesClientImpl(GenericActivityClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }
    
    public OperationActivitiesClientImpl(GenericActivityClient genericClient, 
            DataConverter dataConverter, ActivitySchedulingOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }
    
    @Override
    public final Promise<Double> add(double a, double b) {
        return addImpl(Promise.asPromise(a), Promise.asPromise(b), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Double> add(double a, double b, Promise<?>... waitFor) {
        return addImpl(Promise.asPromise(a), Promise.asPromise(b), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Double> add(double a, double b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return addImpl(Promise.asPromise(a), Promise.asPromise(b), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Double> add(Promise<Double> a, Promise<Double> b) {
        return addImpl(a, b, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Double> add(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor) {
        return addImpl(a, b, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Double> add(Promise<Double> a, Promise<Double> b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return addImpl(a, b, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Double> addImpl(final Promise<Double> a, final Promise<Double> b, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("OperationActivities.add");
		activityType.setVersion("1.0.1");

        Promise[] _input_ = new Promise[2];
        _input_[0] = a;
        _input_[1] = b;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Double.class, waitFor);
    }

    @Override
    public final Promise<Double> subtract(double a, double b) {
        return subtractImpl(Promise.asPromise(a), Promise.asPromise(b), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Double> subtract(double a, double b, Promise<?>... waitFor) {
        return subtractImpl(Promise.asPromise(a), Promise.asPromise(b), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Double> subtract(double a, double b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return subtractImpl(Promise.asPromise(a), Promise.asPromise(b), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Double> subtract(Promise<Double> a, Promise<Double> b) {
        return subtractImpl(a, b, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Double> subtract(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor) {
        return subtractImpl(a, b, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Double> subtract(Promise<Double> a, Promise<Double> b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return subtractImpl(a, b, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Double> subtractImpl(final Promise<Double> a, final Promise<Double> b, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("OperationActivities.subtract");
		activityType.setVersion("1.0.1");

        Promise[] _input_ = new Promise[2];
        _input_[0] = a;
        _input_[1] = b;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Double.class, waitFor);
    }

    @Override
    public final Promise<Double> multiply(double a, double b) {
        return multiplyImpl(Promise.asPromise(a), Promise.asPromise(b), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Double> multiply(double a, double b, Promise<?>... waitFor) {
        return multiplyImpl(Promise.asPromise(a), Promise.asPromise(b), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Double> multiply(double a, double b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return multiplyImpl(Promise.asPromise(a), Promise.asPromise(b), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Double> multiply(Promise<Double> a, Promise<Double> b) {
        return multiplyImpl(a, b, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Double> multiply(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor) {
        return multiplyImpl(a, b, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Double> multiply(Promise<Double> a, Promise<Double> b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return multiplyImpl(a, b, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Double> multiplyImpl(final Promise<Double> a, final Promise<Double> b, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("OperationActivities.multiply");
		activityType.setVersion("1.0.1");

        Promise[] _input_ = new Promise[2];
        _input_[0] = a;
        _input_[1] = b;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Double.class, waitFor);
    }

    @Override
    public final Promise<Double> divide(double a, double b) {
        return divideImpl(Promise.asPromise(a), Promise.asPromise(b), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Double> divide(double a, double b, Promise<?>... waitFor) {
        return divideImpl(Promise.asPromise(a), Promise.asPromise(b), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Double> divide(double a, double b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return divideImpl(Promise.asPromise(a), Promise.asPromise(b), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Double> divide(Promise<Double> a, Promise<Double> b) {
        return divideImpl(a, b, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Double> divide(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor) {
        return divideImpl(a, b, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Double> divide(Promise<Double> a, Promise<Double> b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return divideImpl(a, b, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Double> divideImpl(final Promise<Double> a, final Promise<Double> b, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("OperationActivities.divide");
		activityType.setVersion("1.0.1");

        Promise[] _input_ = new Promise[2];
        _input_[0] = a;
        _input_[1] = b;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Double.class, waitFor);
    }

    @Override
    public final Promise<Double> sum(java.util.List<java.lang.Double> addends) {
        return sumImpl(Promise.asPromise(addends), (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Double> sum(java.util.List<java.lang.Double> addends, Promise<?>... waitFor) {
        return sumImpl(Promise.asPromise(addends), (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Double> sum(java.util.List<java.lang.Double> addends, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return sumImpl(Promise.asPromise(addends), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Double> sum(Promise<java.util.List<java.lang.Double>> addends) {
        return sumImpl(addends, (ActivitySchedulingOptions)null);
    }

    @Override
    public final Promise<Double> sum(Promise<java.util.List<java.lang.Double>> addends, Promise<?>... waitFor) {
        return sumImpl(addends, (ActivitySchedulingOptions)null, waitFor);
    }

    @Override
    public final Promise<Double> sum(Promise<java.util.List<java.lang.Double>> addends, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {
        return sumImpl(addends, optionsOverride, waitFor);
    }
    
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected Promise<Double> sumImpl(final Promise<java.util.List<java.lang.Double>> addends, final ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor) {

        ActivityType activityType = new ActivityType();
		activityType.setName("OperationActivities.sum");
		activityType.setVersion("1.0.1");

        Promise[] _input_ = new Promise[1];
        _input_[0] = addends;

        return (Promise)scheduleActivity(activityType, _input_, optionsOverride, Double.class, waitFor);
    }

}