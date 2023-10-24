//Charlize Puno
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;
    @Test
    public void testFilter() {
        String s1 = "hello"; 
        Boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(b1);
        List<String> expectedList = Arrays.asList(" ", s1, "world");
        List<String> actualList = ListExamples.filter(expectedList, null);
        // List<String> actualList = Arrays.asList(" ", "world", s1 );
        assertEquals(expectedList, actualList);
    }
    //failing inputs, symptoms, bugs
    @Test
    public void testMerge(){
        List<String> input1 = Arrays.asList("a", "b", "c", "d");
        List<String> input2 = Arrays.asList("b", "c", "d", "e");
        List<String> expectedList = Arrays.asList("a", "b", "b", "c", "c", "d","d", "e");
        List<String> actualList = ListExamples.merge(input1, input2);
        assertEquals(expectedList, actualList);
    }
}
