package roadmap;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = a + b;
        System.out.println(isit(a, b, c));

    }

    public static String isit(int a, int b, int c) {

        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s3 = Integer.toString(c);

        s1 = s1.replace("0", "");
        s2 = s2.replace("0", "");
        s3 = s3.replace("0", "");

        int a1 = Integer.parseInt(s1);
        int b1 = Integer.parseInt(s2);
        int c3 = Integer.parseInt(s3);

        if (a1 + b1 == c3) {
            return "yes";
        } else {
            return "no";
        }

    }
}