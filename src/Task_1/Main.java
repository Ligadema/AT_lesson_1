package Task_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введи размер массива: ");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] mas = new int[size];

        System.out.print("Массив в прямом порядке: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
            System.out.print(mas[i] + " ");
        }
        System.out.println(" ");

        System.out.print("Массив в обратном порядке: ");
        for (int i = mas.length-1; i>=0; i--) {
            mas[i] = i;
            System.out.print(mas[i] + " ");
        }
    }
}