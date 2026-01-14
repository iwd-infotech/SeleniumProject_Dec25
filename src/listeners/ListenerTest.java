package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class ListenerTest {
	
	@Test
	public void testPassed() {
		System.out.println("Pass Test");
	}
	
	@Test
	public void testFail() {
		System.out.println("Fail Test");
		assert false;
		
	}

}
