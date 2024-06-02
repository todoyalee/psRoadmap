package roadmap;

import java.util.Scanner;

public class one {
	
	public static void main(String[]args) {
		int a,b,c,d=0,e;
		Scanner sn=new Scanner(System.in);
		
		a=sn.nextInt();
		b=sn.nextInt();
		
		for(int i=0;i<a;i++) {
			c=sn.nextInt();
			
			if(c>b) {
				d=d+2;
				
			}
			else {
				d=d+1;
			}
		}
		
		System.out.println(d);
		
		
	}
}