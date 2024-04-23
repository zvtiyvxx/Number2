package ru.vsuet.matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        Matrix matrix = new Matrix(scanner.nextInt());
        System.out.println("Получилась матрица");
        System.out.println(matrix);

        System.out.println("Сумма элементов выше диагонали: " + matrix.sum());
        System.out.println("Произведение элементов диагонали: " + matrix.diag());
        System.out.println("Разность элементов ниже диагонали: " + matrix.diff());
    }
}
