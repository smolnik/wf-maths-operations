package net.adamsmolnik.wf.definition;

import com.amazonaws.services.simpleworkflow.flow.annotations.Execute;
import com.amazonaws.services.simpleworkflow.flow.annotations.Workflow;
import com.amazonaws.services.simpleworkflow.flow.annotations.WorkflowRegistrationOptions;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

/**
 * @author ASmolnik
 *
 */
@Workflow
@WorkflowRegistrationOptions(defaultExecutionStartToCloseTimeoutSeconds = 600)
public interface OperationsWorkflowSequential {

    @Execute(version = "1.0.0")
    Promise<Double> execute(double a, double b);

}
