/**
 * This code was generated from {@link net.adamsmolnik.wf.definition.OperationsWorkflowSequential}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.wf.definition;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientFactoryExternalBase;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClientExternal;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class OperationsWorkflowSequentialClientExternalFactoryImpl extends
        WorkflowClientFactoryExternalBase<OperationsWorkflowSequentialClientExternal> implements OperationsWorkflowSequentialClientExternalFactory {

    public OperationsWorkflowSequentialClientExternalFactoryImpl(AmazonSimpleWorkflow service, String domain) {
        super(service, domain);
        setDataConverter(new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter());
    }

    public OperationsWorkflowSequentialClientExternalFactoryImpl() {
        super(null);
        setDataConverter(new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter());
    }

    public OperationsWorkflowSequentialClientExternalFactoryImpl(GenericWorkflowClientExternal genericClient) {
        super(genericClient);
        setDataConverter(new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter());
    }

    @Override
    protected OperationsWorkflowSequentialClientExternal createClientInstance(WorkflowExecution workflowExecution, StartWorkflowOptions options,
            DataConverter dataConverter, GenericWorkflowClientExternal genericClient) {
        WorkflowType workflowType = new WorkflowType();
        workflowType = new WorkflowType();
        workflowType.setName("OperationsWorkflowSequential.execute");
        workflowType.setVersion("1.0.0");
        return new OperationsWorkflowSequentialClientExternalImpl(workflowExecution, workflowType, options, dataConverter, genericClient);
    }

}