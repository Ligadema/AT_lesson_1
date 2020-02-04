package Task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int[] mas = {1, 2, 3, 5, 7, 5, 11};

// Способ 1
        System.out.print("Каждый 3й элемент массива умножен на 2: ");
        for (int i = 2; i < mas.length; i++) {
            if (i % 3 == 2) {
                mas[i] *= 2;
                System.out.print(mas[i] + " ");
            }
        }
// Способ 2
        int c = 2;
        while (c < mas.length) {
            mas[c] *= 2;
            c += 3;
        }
        System.out.println("Весь массив, где каждый 3й элемент был умножен на 2: " + Arrays.toString(mas));
    }
}
