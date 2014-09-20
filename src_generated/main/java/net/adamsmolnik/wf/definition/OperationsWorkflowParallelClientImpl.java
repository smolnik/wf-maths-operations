/**
 * This code was generated from {@link net.adamsmolnik.wf.definition.OperationsWorkflowParallel}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.wf.definition;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientBase;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class OperationsWorkflowParallelClientImpl extends WorkflowClientBase implements OperationsWorkflowParallelClient {

    public OperationsWorkflowParallelClientImpl(WorkflowExecution workflowExecution, WorkflowType workflowType, StartWorkflowOptions options,
            DataConverter dataConverter, GenericWorkflowClient genericClient) {
        super(workflowExecution, workflowType, options, dataConverter, genericClient);
    }

    @Override
    public final Promise<java.lang.Double> execute(double a, double b) {
        return execute(Promise.asPromise(a), Promise.asPromise(b), (StartWorkflowOptions) null);
    }

    @Override
    public final Promise<java.lang.Double> execute(double a, double b, Promise<?>... waitFor) {
        return execute(Promise.asPromise(a), Promise.asPromise(b), (StartWorkflowOptions) null, waitFor);
    }

    @Override
    public final Promise<java.lang.Double> execute(double a, double b, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        return execute(Promise.asPromise(a), Promise.asPromise(b), optionsOverride, waitFor);
    }

    @Override
    public final Promise<java.lang.Double> execute(Promise<Double> a, Promise<Double> b) {
        return execute(a, b, (StartWorkflowOptions) null);
    }

    @Override
    public final Promise<java.lang.Double> execute(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor) {
        return execute(a, b, (StartWorkflowOptions) null, waitFor);
    }

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    public final Promise<java.lang.Double> execute(Promise<Double> a, Promise<Double> b, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        Promise[] _input_ = new Promise[2];
        _input_[0] = a;
        _input_[1] = b;
        return (Promise) startWorkflowExecution(_input_, optionsOverride, java.lang.Double.class, waitFor);
    }

}