/**
 * This code was generated from {@link net.adamsmolnik.wf.definition.OperationsWorkflowMix}.
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
package net.adamsmolnik.wf.definition;

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternal;

public interface OperationsWorkflowMixClientExternal extends WorkflowClientExternal
{
    void execute(double a, double b);
    void execute(double a, double b, StartWorkflowOptions optionsOverride);
}