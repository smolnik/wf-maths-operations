/**
 * This code was generated from {@link net.adamsmolnik.activities.util.ResultActivities}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.activities.util;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.ActivitiesClient;
import com.amazonaws.services.simpleworkflow.flow.ActivitySchedulingOptions;

public interface ResultActivitiesClient extends ActivitiesClient
{
    Promise<Void> display(java.lang.String message, double result, java.lang.String processId);
    Promise<Void> display(java.lang.String message, double result, java.lang.String processId, Promise<?>... waitFor);
    Promise<Void> display(java.lang.String message, double result, java.lang.String processId, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
    Promise<Void> display(Promise<java.lang.String> message, Promise<Double> result, Promise<java.lang.String> processId);
    Promise<Void> display(Promise<java.lang.String> message, Promise<Double> result, Promise<java.lang.String> processId, Promise<?>... waitFor);
    Promise<Void> display(Promise<java.lang.String> message, Promise<Double> result, Promise<java.lang.String> processId, ActivitySchedulingOptions optionsOverride, Promise<?>... waitFor);
}