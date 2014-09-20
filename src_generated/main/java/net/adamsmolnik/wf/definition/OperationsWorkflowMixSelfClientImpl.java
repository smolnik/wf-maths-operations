/**
 * This code was generated from {@link net.adamsmolnik.wf.definition.OperationsWorkflowMix}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.wf.definition;

import com.amazonaws.services.simpleworkflow.flow.core.AndPromise;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.core.Task;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowSelfClientBase;
import com.amazonaws.services.simpleworkflow.flow.generic.ContinueAsNewWorkflowExecutionParameters;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;

public class OperationsWorkflowMixSelfClientImpl extends WorkflowSelfClientBase implements OperationsWorkflowMixSelfClient {

    public OperationsWorkflowMixSelfClientImpl() {
        this(null, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public OperationsWorkflowMixSelfClientImpl(GenericWorkflowClient genericClient) {
        this(genericClient, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), null);
    }

    public OperationsWorkflowMixSelfClientImpl(GenericWorkflowClient genericClient, 
            DataConverter dataConverter, StartWorkflowOptions schedulingOptions) {
            
        super(genericClient, dataConverter, schedulingOptions);
    }

    @Override
    public final void execute(double a, double b) { 
        executeImpl(Promise.asPromise(a), Promise.asPromise(b), (StartWorkflowOptions)null);
    }

    @Override
    public final void execute(double a, double b, Promise<?>... waitFor) { 
        executeImpl(Promise.asPromise(a), Promise.asPromise(b), (StartWorkflowOptions)null, waitFor);
    }
    
    @Override
    public final void execute(double a, double b, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        executeImpl(Promise.asPromise(a), Promise.asPromise(b), optionsOverride, waitFor);
    }
    
    @Override
    public final void execute(Promise<Double> a, Promise<Double> b) {
        executeImpl(a, b, (StartWorkflowOptions)null);
    }

    @Override
    public final void execute(Promise<Double> a, Promise<Double> b, Promise<?>... waitFor) {
        executeImpl(a, b, (StartWorkflowOptions)null, waitFor);
    }

    @Override
    public final void execute(Promise<Double> a, Promise<Double> b, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        executeImpl(a, b, optionsOverride, waitFor);
    }
    
    protected void executeImpl(final Promise<Double> a, final Promise<Double> b, final StartWorkflowOptions schedulingOptionsOverride, Promise<?>... waitFor) {
        new Task(new Promise[] { a, b, new AndPromise(waitFor) }) {
    		@Override
			protected void doExecute() throws Throwable {
                ContinueAsNewWorkflowExecutionParameters _parameters_ = new ContinueAsNewWorkflowExecutionParameters();
                Object[] _input_ = new Object[2];
                _input_[0] = a.get();
                _input_[1] = b.get();
                String _stringInput_ = dataConverter.toData(_input_);
				_parameters_.setInput(_stringInput_);
				_parameters_ = _parameters_.createContinueAsNewParametersFromOptions(schedulingOptions, schedulingOptionsOverride);
                
                if (genericClient == null) {
                    genericClient = decisionContextProvider.getDecisionContext().getWorkflowClient();
                }
                genericClient.continueAsNewOnCompletion(_parameters_);
			}
		};
    }
}