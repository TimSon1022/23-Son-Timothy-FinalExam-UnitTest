import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
public class StringCalculatorTest {
	

    @Test
    public void addNegativeNumber1() {
        
        IllegalArgumentException testException = assertThrows(IllegalArgumentException.class, () -> {
        	StringCalculator.add("-1,5");
        });
        assertEquals("Error: Negatives are not allowed", testException.getMessage());

    }
    
    @Test
    public void addingBiggerNumber1() {
    	assertEquals(StringCalculator.add("1, 1000"),1 );
    }
    
    @Test
    public void addNegativeNumber2() {
        
        IllegalArgumentException testException = assertThrows(IllegalArgumentException.class, () -> {
        	StringCalculator.add("9,-3000");
        });
        assertEquals("Error: Negatives are not allowed", testException.getMessage());

    }
    
    @Test
    public void addingBiggerNumber2() {
    	assertEquals(StringCalculator.add("3, 123456789"),3 );
    }
	
	
	
}
