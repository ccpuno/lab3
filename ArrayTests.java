import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input2 = {13.3, 10.0, 5.0, 100.1, -23.7}; 
    double avg = ArrayExamples.averageWithoutLowest(input2);
    assertEquals(" ", 32.1, avg , 0);
  }
  //if the sum returns a double with an infinite number of decimals, it ends at the 15th decimal place.
}

