package net.adamsmolnik.wf.definition;

import com.amazonaws.services.simpleworkflow.flow.annotations.Execute;
import com.amazonaws.services.simpleworkflow.flow.annotations.Workflow;
import com.amazonaws.services.simpleworkflow.flow.annotations.WorkflowRegistrationOptions;

/**
 * @author ASmolnik
 *
 */
@Workflow
@WorkflowRegistrationOptions(defaultExecutionStartToCloseTimeoutSeconds = 600)
public interface OperationsWorkflowFirst {

    @Execute(version = "1.0.4")
    void execute(double a, double b);

}
