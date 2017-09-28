package assignment3_part1.sampleassignment3;
import static org.mockito.Mockito.*;
// test
import junit.framework.TestCase;

public class calcImplemintationTest extends TestCase {
	calcImplemintation obj;
	int x, y;

	protected void setUp() throws Exception {
		obj =new calcImplemintation();
		x = 7;
		y = 10;
		calcInterface mockObj = mock(calcInterface.class);
		when(mockObj.add(x, y)).thenReturn(x+y);
	obj.setIntObj(mockObj, mockObj);	
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;	
	}
	public void testAddTwoNums() {
		assertEquals(17, obj.addTwoNums(x, y));
	}
}


