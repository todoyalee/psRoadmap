package roadmap;

import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        int a, b = 0, c, d;
        String ch1, ch2, ch3;
        Scanner sn = new Scanner(System.in);
        ch1 = sn.next();
        ch2 = sn.next();

        for (int i = 0; i < ch1.length(); i++) {
            if (ch1.toLowerCase().charAt(i) < ch2.toLowerCase().charAt(i)) {
                b = -1;
            } else if (ch1.toLowerCase().charAt(i) > ch2.toLowerCase().charAt(i)) {
                b = 1;
            } else {
                b = 0;
            }
        }
        System.out.println(b);

    }
}