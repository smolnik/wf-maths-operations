/**
 * This code was generated from {@link net.adamsmolnik.wf.definition.OperationsWorkflowParallel}.
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

public class OperationsWorkflowParallelClientExternalFactoryImpl extends WorkflowClientFactoryExternalBase<OperationsWorkflowParallelClientExternal>  implements OperationsWorkflowParallelClientExternalFactory {

    public OperationsWorkflowParallelClientExternalFactoryImpl(AmazonSimpleWorkflow service, String domain) {
		super(service, domain);
		setDataConverter(new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter());
	}
	
	public OperationsWorkflowParallelClientExternalFactoryImpl() {
        super(null);
		setDataConverter(new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter());
    }
    
    public OperationsWorkflowParallelClientExternalFactoryImpl(GenericWorkflowClientExternal genericClient) {
        super(genericClient);
		setDataConverter(new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter());
    }
	
    @Override
    protected OperationsWorkflowParallelClientExternal createClientInstance(WorkflowExecution workflowExecution,
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClientExternal genericClient) {
        WorkflowType workflowType = new WorkflowType();
        workflowType = new WorkflowType();
        workflowType.setName("OperationsWorkflowParallel.execute");
        workflowType.setVersion("1.0.0");
        return new OperationsWorkflowParallelClientExternalImpl(workflowExecution, workflowType, options, dataConverter, genericClient);
    }
    
}