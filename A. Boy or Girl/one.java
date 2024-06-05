package roadmap;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        String a;
        int b = 0, c = 0, d = 0;
        Scanner sn = new Scanner(System.in);
        a = sn.next();
        c = a.length();

        for (int i = 0; i < a.length(); i++) {
            for (int j = 1; j < a.length() - 1; j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    b++;
                }
            }
        }

        d = c - b;
        if (d % 2 == 0) {
            System.out.println("chat with her");
        } else {
            System.out.println("ignore him");
        }

    }
}