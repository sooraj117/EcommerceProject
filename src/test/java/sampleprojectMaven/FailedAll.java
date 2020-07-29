  package sampleprojectMaven;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;

public class FailedAll implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
		// TODO Auto-generated method stub
		
		IRetryAnalyzer s = annotation.getRetryAnalyzer();
		if(s==null) {
			annotation.setRetryAnalyzer(Failed.class);
		}
		
	}
	
	
	public void verifyimageActive(WebElement imgElement) {
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(imgElement.getAttribute("src"));
			HttpResponse response = client.execute(request);
			// verifying response code he HttpStatus should be 200 if not,
			// increment as invalid images count
			if (response.getStatusLine().getStatusCode() != 200)
				invalidImageCount++;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void tc2 () {
		   HashMap<Integer, String> lli = new HashMap<Integer, String>();
		lli.put(12212, "sffd");
		lli.put(435, "gfhf");
		lli.put(654, "sf");
		lli.put(1321, "fgsdg");
		
	Set<Entry<Integer,String>> s=lli.entrySet();
	for (Entry<Integer, String> entry : s) {
		entry.getKey();                                       
	}
	}
	@Test
	public void tc1() {
		Realp r1 = Realp.add();
		r1.sample();
		
		  List< Integer > llll = new ArrayList<Integer>();
		  llll.add(435);
		  llll.add(98);
		  
		  for(int i=0;i<=llll.size();i++) {
			  int ddd = llll.get(i);
			  
			  
			  
		  }
	}

}
