package groupings;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test1 {
    
	@BeforeGroups(groups = "Regression")
	public void testGroups()
	{
	System.out.println("Im in Before testGrouping");
	}
	
	@AfterGroups(groups = "Regression")
	public void testAfterGroups()
	{
	System.out.println("Im in After testGrouping");
	}
	
	
	
	@Test(groups="Regression")
	public void testCaseOne()
	{
	System.out.println("Im in testCaseOne - And in Regression Group");
	}
	@Test(groups="Regression")
	public void testCaseTwo(){
	System.out.println("Im in testCaseTwo - And in Regression Group");
	}
	@Test(groups="Smoke Test")
	public void a(){
	System.out.println("Im in testCaseThree - And in Smoke Test Group");
	}
	@Test
	public void test(){
	System.out.println("Test Execution");
	}
	@Test(groups="Regression")
	public void testCaseFour(){
	System.out.println("Im in testCaseFour - And in Regression Group");
	}
}