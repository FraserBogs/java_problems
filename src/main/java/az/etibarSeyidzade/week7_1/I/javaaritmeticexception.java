package az.etibarSeyidzade.week7_1.I;

import java.util.Scanner;

public class javaaritmeticexception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            try {
                System.out.println(n / m);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }
        }
    }
}
