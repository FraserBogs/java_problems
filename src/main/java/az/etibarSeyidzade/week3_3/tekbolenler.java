package az.etibarSeyidzade.week3_3;

import java.util.Scanner;

public class tekbolenler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}