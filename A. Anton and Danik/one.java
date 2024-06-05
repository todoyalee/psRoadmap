package roadmap;

import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        int a, b = 0, c = 0;
        String ch;
        Scanner sn = new Scanner(System.in);
        a = sn.nextInt();
        ch = sn.next();

        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == 'A') {
                b++;

            } else {
                c++;
            }
        }

        if (b > c) {
            System.out.println("Anton");
        } else if (b < c) {
            System.out.println("Danik");
        } else {
            System.out.println("friendship");
        }

    }
}