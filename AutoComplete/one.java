package roadmap;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        String s = sn.next().trim();
        int a = sn.nextInt();

        sn.nextLine();
        String address = null;

        for (int i = 0; i < a; i++) {
            String page = sn.nextLine().trim();

            if (page.startsWith(s)) {

                if (address == null || page.compareTo(address) < 0) {
                    page = address;
                }
            }
        }

        if (address != null) {
            System.out.println(address);
        } else {
            System.out.println(s);
        }
        sn.close();

    }
}