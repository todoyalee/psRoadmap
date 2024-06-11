package roadmap;

import java.util.HashSet;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a, b, c, d, e;

        a = sn.nextInt();
        b = sn.nextInt();
        c = sn.nextInt();
        d = sn.nextInt();

        HashSet<Integer> h = new HashSet<>();

        h.add(a);
        h.add(b);
        h.add(c);
        h.add(d);

        e = 4 - h.size();

        System.out.println(e);
    }
}