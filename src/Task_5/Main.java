package Task_5;

public class Main {

    public static void main(String[] args) {

        int[] mas = {1, 9, 9, 1, 10, 5, 9};

        int n = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] == 0)
                n = i;
            System.out.print(n);
        }
        if (n == 0)
            System.out.print(" - нулевых элементов в массиве нет.");

    }
}