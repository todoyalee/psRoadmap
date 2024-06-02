
import java.util.Scanner;

public class one {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int a, b = 0, c = 0, d;
        a = sn.nextInt();
        String t[] = new String[a];

        for (int i = 0; i < t.length; i++) {
            t[i] = sn.next();

            if (t[i].equals("A")) {
                b++;
            }
            if (t[i].equals("D")) {
                c++;
            }
        }

        if (b > c) {
            System.out.println("anton");
        }

        else if (b < c) {
            System.out.println("danik");
        } else {
            System.out.println("friendship");
        }

    }
}