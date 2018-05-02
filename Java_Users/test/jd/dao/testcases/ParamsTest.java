package jd.dao.testcases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamsTest {
	//Data members variables
	//Variables declared here must be in same order for constructor and collection items
	String name;
	Integer age;
	
	//Feeder Method
	@Parameters
	public static Collection<Object[]> data(){
		Object[][] obj = {
				{"Mike", 23},
				{"Tony", 28},
				{"Bairon", 24}
		};
		
		return Arrays.asList(obj);
	}
	
	//Constructor with parameters
	public ParamsTest(String pName, Integer pAge) {
		this.name = pName;
		this.age = pAge;
	}
	
	//test
	@Test
	public void testCase() {
		System.out.println("This name = " + name);
		System.out.println("This age = " + age);
	}
}
