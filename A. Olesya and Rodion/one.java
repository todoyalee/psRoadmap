package roadmap;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        yoo();

    }

    static void yoo() {

        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        String t = sn.next();

        while (t.length() < n) {
            t += "0";
        }

        System.out.println(t.length() == n ? t : -1);
    }
}