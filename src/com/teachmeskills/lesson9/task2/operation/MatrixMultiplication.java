package com.teachmeskills.lesson9.task2.operation;

/**
 * the class contains a matrix multiplication method
 */
public class MatrixMultiplication {
    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        int[][] multipl = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < multipl.length; i++) {
            for (int j = 0; j < multipl[0].length; j++) {
                for (int k = 0; k < matrix1.length; k++) {
                    multipl[i][j] = multipl[i][j] + (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
        return multipl;
    }
}
