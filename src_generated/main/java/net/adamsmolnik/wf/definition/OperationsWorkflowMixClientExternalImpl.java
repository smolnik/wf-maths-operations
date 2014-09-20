/**
 * This code was generated from {@link net.adamsmolnik.wf.definition.OperationsWorkflowMix}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.wf.definition;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternalBase;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClientExternal;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class OperationsWorkflowMixClientExternalImpl extends WorkflowClientExternalBase implements OperationsWorkflowMixClientExternal {

    public OperationsWorkflowMixClientExternalImpl(WorkflowExecution workflowExecution, WorkflowType workflowType, 
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClientExternal genericClient) {
        super(workflowExecution, workflowType, options, dataConverter, genericClient);
    }

    @Override
    public void execute(double a, double b) { 
        execute(a, b, null);
    }

    @Override
    public void execute(double a, double b, StartWorkflowOptions startOptionsOverride) {
    
        Object[] _arguments_ = new Object[2]; 
        _arguments_[0] = a;
        _arguments_[1] = b;
        dynamicWorkflowClient.startWorkflowExecution(_arguments_, startOptionsOverride);
    }


}