/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.vannhat.mathutil.core.test;

import static org.vannhat.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.vannhat.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //assertEquals(69,69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
         assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
    }
}
//DDT    là 1 phân mo rông cua cac UNIT Test Framework
// Data driven testing
//      ko nhâm vs TDD: Test Driven Development
//         viêt code va viêt test case song hàn
//                 vs nhau, dã hoc xong
// nhung code test da bóc mùi(Bad Smells) trùng nhieu code