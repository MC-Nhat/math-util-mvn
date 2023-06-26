/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.vannhat.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.vannhat.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtilityAdvancedTest {

    // tao mang 2 chieu dua data se dung cho viec tra ve assertE()
    // gom n dua vao va expected tra ve
    // int long --> Object (wrapper class)
    //                      Integer Long
    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1},
                               {1, 1},
                               {2, 2},
                               {4, 24},
                               {5, 120}};
        return  testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
 public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        //assertEquals(69,69);
        assertEquals(expected, MathUtility.getFactorial(n));
        
}
 public static long getFactorial(int n) {
        if (n < 0 || n > 21) 
            throw new IllegalArgumentException("Invalid n. n must be betweent 0..20, please");
        
        if (n == 0 || n == 1) 
            return 1;
            
            return n * getFactorial(n-1);
            //công thuc de quy
        }
 }
 // TDD : test Driven Development là ki thuât lâp trình ma 
 //   gan liên vs viêc viêt các test case dê tìm kiêm thu ngay nhung hàm  dev mình vua viêt
 //   Viêt code chính và viêt code test (JUnit,Unit Test) xen ke
 //  voi nhau. 2 màu xanh do liên tuc diên ra
 
 //  DDT : su mo rông thêm cho quá trình viêt code test (JUnit)
 //   Data Driven Testing
 //   ki thuât tách bô test data ra 1 chô riêng, tách vào mang
 // tách vào file Excel, hay table, sa dó nhôi/fill/map
 //  cái data tu mang này trong hàm so sánh
 // giúp code de doc hon
