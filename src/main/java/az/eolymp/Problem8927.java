package az.eolymp;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem8927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger bigInteger = sc.nextBigInteger();
        if (bigInteger.isProbablePrime(1)) {
            System.out.println(bigInteger);
        } else {
            int d = 0;
            for (int i = 2; i <= bigInteger.intValue(); i++) {
                if (bigInteger.intValue() % i == 0) {
                    d = i;
                    break;
                }
            }
            System.out.println(d);
        }
    }
}
