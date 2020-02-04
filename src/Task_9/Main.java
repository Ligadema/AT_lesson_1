package Task_9;

public class Main {

    public static void main(String[] args) {

        int[] mas = {1, 5, 3, 0, 7};

        int max = 0;
        int min = 0;

        for (int i = 0; i < mas.length; i++) {
            if (max <= mas[i])
                max = i;
        }
        System.out.println(max);

        for (int i = 0; i < mas.length; i++) {
            if (min >= mas[i])
                min = i;
        }
        System.out.println(min);
    }
}
