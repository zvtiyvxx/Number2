package ru.vsuet.matrix;

import java.util.Random;
import java.util.Arrays;

public class Matrix {
    private int[][] matrix;

    public Matrix(int size){
        matrix = new int[size][size];
        generateMatrix();
    }

    private void generateMatrix(){
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = random.nextInt(9-1)+1;
            }
        }
    }

    public String toString() {
        return Arrays.deepToString(matrix)
                .replace("[[" , "   ")
                .replace("]" , "\n")
                .replace("," , " ")
                .replace("[" , " ");
    }

    private int sumMatrix() {
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix.length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private int diffMatrix(){
        int difference = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < i; j++){
                difference -= matrix[i][j];
            }
        }
        return difference;
    }

    private int diagMatrix(){
        int result = 1;
        for(int i = 0; i < matrix.length; i++){
            result *= matrix[i][i];
        }
        return result;
    }

    public int sum() {
        return sumMatrix();
    }

    public int diff(){
        return diffMatrix();
    }

    public int diag(){
        return diagMatrix();
    }
}
