/**
 * This code was generated from {@link net.adamsmolnik.wf.definition.OperationsWorkflowSequential}.
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

public class OperationsWorkflowSequentialClientFactoryImpl extends WorkflowClientFactoryBase<OperationsWorkflowSequentialClient> implements
        OperationsWorkflowSequentialClientFactory {

    public OperationsWorkflowSequentialClientFactoryImpl() {
        this(null, null, null);
    }

    public OperationsWorkflowSequentialClientFactoryImpl(StartWorkflowOptions startWorkflowOptions) {
        this(startWorkflowOptions, null, null);
    }

    public OperationsWorkflowSequentialClientFactoryImpl(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter) {
        this(startWorkflowOptions, dataConverter, null);
    }

    public OperationsWorkflowSequentialClientFactoryImpl(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter,
            GenericWorkflowClient genericClient) {
        super(startWorkflowOptions, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), genericClient);
    }

    @Override
    protected OperationsWorkflowSequentialClient createClientInstance(WorkflowExecution execution, StartWorkflowOptions options,
            DataConverter dataConverter, GenericWorkflowClient genericClient) {
        WorkflowType workflowType = new WorkflowType();
        workflowType.setName("OperationsWorkflowSequential.execute");
        workflowType.setVersion("1.0.0");
        return new OperationsWorkflowSequentialClientImpl(execution, workflowType, options, dataConverter, genericClient);
    }

}