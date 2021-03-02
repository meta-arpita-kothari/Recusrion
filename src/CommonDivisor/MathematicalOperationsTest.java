package CommonDivisor;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;
import org.junit.Test;


public class MathematicalOperationsTest {

	@Test
	public void testLCM(){
//		MathematicalOperations obj = new MathematicalOperations();
		
		int lcm = MathematicalOperations.findLCM(2, 4);
		assertEquals(4,lcm);
	}
	
	@Test
	public void testHCF(){
//		MathematicalOperations obj = new MathematicalOperations();
		
		int hcf = MathematicalOperations.findHCF(2, 4);
		assertEquals(2,hcf);
	}

}
