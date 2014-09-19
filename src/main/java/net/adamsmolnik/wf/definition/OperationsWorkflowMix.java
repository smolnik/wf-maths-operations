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
public interface OperationsWorkflowMix {

    @Execute(version = OpsMixWfVersion.VERSION)
    Promise<Double> execute(double a, double b);

}
