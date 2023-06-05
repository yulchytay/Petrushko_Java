package Petrushko_Java;

import java.util.Scanner;

public class Task3 {
    public static void printThree(int[] array) {
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = console.nextInt();
        int[] myArray = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            myArray[i] = console.nextInt();
        }
        System.out.println("Числа массива кратные 3:");
        printThree(myArray);
    }
}
