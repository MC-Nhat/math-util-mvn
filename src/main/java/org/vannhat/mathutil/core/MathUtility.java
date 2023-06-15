/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.vannhat.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {

    public static final double PI = 3.1415;

    public static long getFactorial(int n) {
        if (n < 0 || n > 21) {
            throw new IllegalArgumentException("Invalid n. n must be betweent 0..20, please");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1; // tích nhân dôn khoi dông tu 1
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;

    }
}
