package Task_4;

public class Main {

    public static void main(String[] args) {

        int[] mas = {1, 0, 3, 1, 0, 5, 0};

        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0)
                sum++; }
        System.out.print("Количество нулевых элементов: " + sum);
        if (sum == 0)
            System.out.print(" - нулевых элементов в массиве нет.");

    }
}
