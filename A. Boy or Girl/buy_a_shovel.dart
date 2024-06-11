package roadmap;

import java.util.Scanner;

public class one{
	public static void main(String[]args) {
		Scanner sn = new Scanner(System.in);
		int k=sn.nextInt();
		int r=sn.nextInt();
		
		int shovels=0;
		
		
		for(int i=1;;i++) {
			if(k%1*i==0 || k*i%10==r) {
				shovels=i;
				break;
			}
		}
	}
}