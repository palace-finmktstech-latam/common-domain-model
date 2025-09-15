# Package: cdm.event.workflow.functions

## Abstract Classes

### Create_AcceptedWorkflowStep
**Implements:** `RosettaFunction` 

**Fields:**
- `ConditionValidator conditionValidator`
- `ModelObjectValidator objectValidator`

### Create_AcceptedWorkflowStepFromInstruction
**Implements:** `RosettaFunction` 

**Fields:**
- `ConditionValidator conditionValidator`
- `ModelObjectValidator objectValidator`
- `Create_BusinessEvent create_BusinessEvent`

### Create_ProposedWorkflowStep
**Implements:** `RosettaFunction` 

**Fields:**
- `ConditionValidator conditionValidator`
- `ModelObjectValidator objectValidator`

### Create_RejectedWorkflowStep
**Implements:** `RosettaFunction` 

**Fields:**
- `ConditionValidator conditionValidator`
- `ModelObjectValidator objectValidator`

### Create_Workflow
**Implements:** `RosettaFunction` 

**Fields:**
- `ModelObjectValidator objectValidator`

### Create_WorkflowStep
**Implements:** `RosettaFunction` 

**Fields:**
- `ConditionValidator conditionValidator`
- `ModelObjectValidator objectValidator`

## Concrete Classes

### Create_AcceptedWorkflowStepDefault
**Extends:** `Create_AcceptedWorkflowStep` 

### Create_AcceptedWorkflowStepFromInstructionDefault
**Extends:** `Create_AcceptedWorkflowStepFromInstruction` 

### Create_ProposedWorkflowStepDefault
**Extends:** `Create_ProposedWorkflowStep` 

### Create_RejectedWorkflowStepDefault
**Extends:** `Create_RejectedWorkflowStep` 

### Create_WorkflowDefault
**Extends:** `Create_Workflow` 

### Create_WorkflowStepDefault
**Extends:** `Create_WorkflowStep` 

