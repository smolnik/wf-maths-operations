/**
 * This code was generated from {@link net.adamsmolnik.activities.maths.OperationActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.activities.maths;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.ActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;

public interface OperationActivitiesClient extends ActivitiesClient
{
    Promise<Double> add(double a, double b);
    Promise<Double> add(double a, double b, Promise<?>... waitFor);
    Promise<Double> add(double a, double b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Double> add(Promise<Double> a, Promise<Double> b);
    Promise<Double> add(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor);
    Promise<Double> add(Promise<Double> a, Promise<Double> b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Double> subtract(double a, double b);
    Promise<Double> subtract(double a, double b, Promise<?>... waitFor);
    Promise<Double> subtract(double a, double b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Double> subtract(Promise<Double> a, Promise<Double> b);
    Promise<Double> subtract(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor);
    Promise<Double> subtract(Promise<Double> a, Promise<Double> b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Double> multiply(double a, double b);
    Promise<Double> multiply(double a, double b, Promise<?>... waitFor);
    Promise<Double> multiply(double a, double b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Double> multiply(Promise<Double> a, Promise<Double> b);
    Promise<Double> multiply(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor);
    Promise<Double> multiply(Promise<Double> a, Promise<Double> b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Double> divide(double a, double b);
    Promise<Double> divide(double a, double b, Promise<?>... waitFor);
    Promise<Double> divide(double a, double b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Double> divide(Promise<Double> a, Promise<Double> b);
    Promise<Double> divide(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor);
    Promise<Double> divide(Promise<Double> a, Promise<Double> b, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Double> sum(java.util.List<java.lang.Double> addends);
    Promise<Double> sum(java.util.List<java.lang.Double> addends, Promise<?>... waitFor);
    Promise<Double> sum(java.util.List<java.lang.Double> addends, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Double> sum(Promise<java.util.List<java.lang.Double>> addends);
    Promise<Double> sum(Promise<java.util.List<java.lang.Double>> addends, Promise<?>... waitFor);
    Promise<Double> sum(Promise<java.util.List<java.lang.Double>> addends, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
}