package az.iktlab.lessons.lessonHacker.java;

import java.math.BigInteger;
import java.util.Scanner;

public class hacker18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
