package com.teachmeskills.lesson9.task2;

import com.teachmeskills.lesson9.task2.operation.MatrixMultiplication;

/**
 * contains fields with matrices and a method for running the program.
 */

public class Runner {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][]{
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };

        int [][] matrix2 = new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        System.out.println( " first matrix ");
        Utils.utils(matrix1);

        System.out.println("second matrix ");
        Utils.utils(matrix2);

        System.out.println(" their multiplication ");
        Utils.utils(MatrixMultiplication.matrixMultiplication(matrix1, matrix2));
    }
}
