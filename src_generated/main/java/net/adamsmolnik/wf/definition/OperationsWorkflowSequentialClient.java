/**
 * This code was generated from {@link net.adamsmolnik.wf.definition.OperationsWorkflowSequential}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.wf.definition;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClient;

public interface OperationsWorkflowSequentialClient extends WorkflowClient {
    Promise<java.lang.Double> execute(double a, double b);

    Promise<java.lang.Double> execute(double a, double b, Promise<?>... waitFor);

    Promise<java.lang.Double> execute(double a, double b, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

    Promise<java.lang.Double> execute(Promise<Double> a, Promise<Double> b);

    Promise<java.lang.Double> execute(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor);

    Promise<java.lang.Double> execute(Promise<Double> a, Promise<Double> b, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);
}