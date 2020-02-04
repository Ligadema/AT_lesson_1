package Task_6;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int [] mas = {1,5,3,1};

        for(int i=0;i<mas.length;i++) {
            for(int j=0;j<mas.length;j++) {
                int n = mas[i];
                mas[i]=mas[j];
                mas[j]=n;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}