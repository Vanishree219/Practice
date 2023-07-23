package DemoPackage;

import java.util.Scanner;

public class DemoMethods {

	
	public void duplicateNumbers() {
		
		long num;
		
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextLong();
		
		int digit;
		int count=0;
		digit = scan.nextInt();
		
		System.out.println(num+" "+digit);
		
		while(num>0) {
			
			long lastnum = num%10;
			
			if(lastnum ==digit) {
				count++;
			}
			 num = num/10;
			 
	}
		
		System.out.println(count);
		
		
		
	}
}
