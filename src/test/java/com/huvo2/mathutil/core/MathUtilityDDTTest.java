/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.huvo2.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author huvo2
 */
public class MathUtilityDDTTest {
    
    // chuẩn bị bộ data sẽ dùng trong hàm assert()
    // hàm trả về mảng 2 chiều
    public static Object[][] initData(){
        Object[][] testData = {{1, 0},
                               {1, 1},
                               {6, 3}, 
                               {24, 4}, 
                               {120, 5}
                              };
        return testData;
    }
    
    //nhồi data vào hàm kiểm thử
    @ParameterizedTest
    @MethodSource("initData")
    public void verifyFactorialGivenRightArgumentReturnsOk(long expected, int n){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
