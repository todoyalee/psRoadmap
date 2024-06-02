

import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        int a, b, c = 0;
        Scanner sn = new Scanner(System.in);

        a = sn.nextInt();
        b = sn.nextInt();

        for (int i = 0; i < 100; i++) {
            if (a > b) {
                c = i;
                break;
            }
            a = a * 3;
            b = b * 2;
        }
        System.out.println(c);

    }
}