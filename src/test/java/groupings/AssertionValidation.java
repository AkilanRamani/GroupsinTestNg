package groupings;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionValidation {
	
	@Test
	   public void testAssertions() {
	      //test data
	      String str1 = new String ("abc");
	      String str2 = new String ("abc");
	      String str3 = null;
	      String str4 = "abc";
	      String str5 = "abc";
			
	      int val1 = 5;
	      int val2 = 6;

	      String[] expectedArray = {"one", "two", "three"};
	      String[] resultArray =  {"one", "two", "three"};

	      //Check that two objects are equal
	      assertEquals(str1, str2);

	      //Check that a condition is true
	      assertTrue (val1 < val2);

	      //Check that a condition is false
	      assertFalse(val1 > val2);

	      //Check that an object isn't null
	      assertNotNull(str1);

	      //Check that an object is null
	      assertNull(str3);

	      //Check if two object references point to the same object
	      assertSame(str4,str5);

	      //Check if two object references not point to the same object
	      assertNotSame(str1,str3);

	      //Check whether two arrays are equal to each other.
	    
	}
	
}
	


