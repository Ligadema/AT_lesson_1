package Task_2;

public class Main {

    public static void main(String[] args) {

        int[] mas = {1, 2, 3};

        System.out.print("ПроизведениЯ элементов массива: ");

        int p;
        for (int i = mas[0]; i < mas.length; i++) {
            p = i * mas[i];
            System.out.print(p + " ");
        }
    }
}
