package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class sertoperatoru4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n >= 0) {
            System.out.println(n * n * n + 2 * n * n + 4 * n - 6);
        } else {
            System.out.println(n * n * n - 7 * n);
        }
    }
}
