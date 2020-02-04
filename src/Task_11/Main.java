package Task_11;

public class Main {

    public static void main(String[] args) {

        double[] mas = {1.0, 2.0, 3.0, 9.0, 5.0};
        double[] mas2 = new double[5];

        double c;
        for (int i = 0; i < mas.length; i++) {
            c = mas[i] / 2;
            mas[i] = c;
        }
        for (int i = 0; i <= mas.length; i++) {
            for (int j = 1; j <= mas2.length; j++) {
                mas2[j] = mas[i + 1];
                System.out.print(mas[j] + " ");
            }
        }
    }
}
