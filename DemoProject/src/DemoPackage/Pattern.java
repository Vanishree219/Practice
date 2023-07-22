package DemoPackage;

import java.util.Scanner;

public class Pattern {

	
	public void pattern1() {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
	for(int i=n;i>=1;i--) {
			
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			
			System.out.println("\n");
			
		}
		
for(int i=n;i>=1;i--) {
			
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println("\n");
			
		}
	}
	
	
}
