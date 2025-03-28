package model;

import java.util.List;
import java.util.function.Predicate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gemoc.trace.simple.RuntimeStep;

public class TTQSelectionFunctions {
	
	public List<RuntimeStep> allMethodCalls(EList<RuntimeStep> steps) {		
	
		Predicate<RuntimeStep> allMethodCalls = step -> TTQProgramState.isMethodCall(step);		
		return steps.stream().filter(allMethodCalls).toList();	
	}

	public List<RuntimeStep> allAssignments(EList<RuntimeStep> steps) {		
	
		Predicate<RuntimeStep> allAssignments = step -> TTQProgramState.isAssignment(step);		
		return steps.stream().filter(allAssignments).toList();	
	}

}
