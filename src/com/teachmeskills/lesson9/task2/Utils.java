package com.teachmeskills.lesson9.task2;

import java.util.Arrays;

/**
 * contains a method for displaying a matrix on the screen
 */

public class Utils {
    public static void utils(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }
}
