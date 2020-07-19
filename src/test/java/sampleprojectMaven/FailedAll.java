  package sampleprojectMaven;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
		// TODO Auto-generated method stub
		
		IRetryAnalyzer s = annotation.getRetryAnalyzer();
		if(s==null) {
			annotation.setRetryAnalyzer(Failed.class);
		}
		
	}

}
