package Task_10;

public class Main {

    public static void main(String[] args) {

        int[] mas = {1, 2, 3, 9, 5};

        boolean x = true;

        for (int i = 1; i < mas.length; i++) {

            if (mas[i] <= mas[i-1]) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("da");
        } else {
            System.out.println("net");
        }
    }
}
