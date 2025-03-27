package tests;

import java.io.File;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.trace.simple.RuntimeStep;
import org.eclipse.gemoc.trace.simple.SimpleTrace;

import com.google.common.io.Files;

public final class TTQTestResources {
	private static SimpleTrace trace;
	
	public static SimpleTrace miniJavaTraceExample() {
		if (trace == null) {
			Resource r = TTQTestResources.miniJavaTraceResource();
			EcoreUtil.resolveAll(r.getResourceSet());
			trace = (SimpleTrace) r.getContents().get(0);
		}
		return trace;
	}
	
	private static Resource miniJavaTraceResource() {
		ResourceSet rs = new ResourceSetImpl();
		// Local path ?
		System.out.println(
		Paths.get(".").toAbsolutePath().toString());
		
		return rs.getResource(URI.createFileURI("src/tests/minijava-example.simpletrace"), true);
	
	}
	
	public static RuntimeStep miniJavaMethodCallStepExample() {
		return TTQTestResources.miniJavaRootStepsExample().get(1).getSubSteps().get(9);
	}
	
	public static EList<RuntimeStep> miniJavaRootStepsExample() {
		return TTQTestResources.miniJavaTraceExample().getRootSteps();		
	}
	
}
