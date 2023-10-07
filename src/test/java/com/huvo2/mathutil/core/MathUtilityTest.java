
package com.huvo2.mathutil.core;

import static com.huvo2.mathutil.core.MathUtility.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MathUtilityTest {
    
    //Cấu trúc TC: ID | Description | Procedures/Steps | Expected Result | Status
    //Test Case #1: Verify getFactorial(0)
    //Test Procedures/Steps:
    //      1. Given n = 0
    //      2. Call/Invoke getFactorial(n = 0)
    //Expected Result: 
    //          the method must return 1 as the result of 0!
    //Status: PASSED | FAILED
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk(){       
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk(){       
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk(){       
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    
    
}
