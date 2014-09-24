/**
 * This code was generated from {@link net.adamsmolnik.wf.definition.OperationsWorkflowParallel}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.wf.definition;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowSelfClient;

public interface OperationsWorkflowParallelSelfClient extends WorkflowSelfClient
{
    void execute(double a, double b);
    void execute(double a, double b, Promise<?>... waitFor);
    void execute(double a, double b, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);
    void execute(Promise<Double> a, Promise<Double> b);
    void execute(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor);
    void execute(Promise<Double> a, Promise<Double> b, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);
}