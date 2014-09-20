/**
 * This code was generated from {@link net.adamsmolnik.wf.definition.OperationsWorkflowMix}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.wf.definition;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientFactoryBase;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class OperationsWorkflowMixClientFactoryImpl extends WorkflowClientFactoryBase<OperationsWorkflowMixClient> implements OperationsWorkflowMixClientFactory {
    
    public OperationsWorkflowMixClientFactoryImpl() {
        this(null, null, null);
    }

    public OperationsWorkflowMixClientFactoryImpl(StartWorkflowOptions startWorkflowOptions) {
        this(startWorkflowOptions, null, null);
    }

    public OperationsWorkflowMixClientFactoryImpl(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter) {
        this(startWorkflowOptions, dataConverter, null);
    }

    public OperationsWorkflowMixClientFactoryImpl(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter,
            GenericWorkflowClient genericClient) {
        super(startWorkflowOptions, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), genericClient);
    }
    
    @Override
    protected OperationsWorkflowMixClient createClientInstance(WorkflowExecution execution,
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClient genericClient) {
        WorkflowType workflowType = new WorkflowType();
        workflowType.setName("OperationsWorkflowMix.execute");
        workflowType.setVersion("1.0.1");
        return new OperationsWorkflowMixClientImpl(execution, workflowType, options, dataConverter, genericClient);
    }
   
}