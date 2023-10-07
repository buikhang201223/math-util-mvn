/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huvo2.mathutil.main;

import com.huvo2.mathutil.core.MathUtility;

/**
 *
 * @author huvo2
 */
public class Main {

    public static void main(String[] args) {
        //test thử cái hàm tính giai thừa có đúng ko
        //chuẩn bị bộ data test, test case
        //Test Case #1: Check if getFactorial() runs well with n = 0
        //Test Procedures/Steps:
        //      Given n = 0
        //      Invoke getFactorial(n = 0)

        //Expected Result: 1;  //0! == 1????
        long expected = 1; //hy vọng 1
        int n = 0;         //nếu anh đưa vào 0!
        long actual = MathUtility.getFactorial(n);   //chạy hàm mới biết
        
        //in ra và tự kết luận có giống kì vọng hay ko
        System.out.println(n + "! | expected = " + expected +
                                " | actual = " + actual);
               
        //test thử cái hàm tính giai thừa có đúng ko
        //chuẩn bị bộ data test, test case
        //Test Case #2: Check if getFactorial() runs well with n = 1
        //Test Procedures/Steps:
        //      Given n = 1
        //      Invoke getFactorial(n = 1)

        //Expected Result: 1;  //1! == 1????
        System.out.println("1! | expected = " + expected +
                                " | actual = " + MathUtility.getFactorial(1));
        System.out.println("1! | expected = " + expected +
                                " | actual = " + MathUtility.getFactorial(20));

    }
}
