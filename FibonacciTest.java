import junit.framework.*;
import org.junit.Test;

public class FibonacciTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		assertEquals(0, Fibonacci.fibo(0));
	    assertEquals(1, Fibonacci.fibo(1));
	    assertEquals(8, Fibonacci.fibo(6));
	    assertEquals(21, Fibonacci.fibo(8));
	}
}
