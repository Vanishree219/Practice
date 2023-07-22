package DemoPackage;

import java.util.HashMap;
import java.util.Map;

public class WordsInString {
	
	

	public static void main(String[] args) {
		
		String s1 = "Hi Deena How are you";
		
		String s[] = s1.split(" ");
		
		int i=0;
		int j=s.length-1;
		
		while(i<j) {
			String temp = s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
			
			
		}
		String rev="";
		for(int k=0;k<s.length;k++) {
		System.out.println(s[k]);
		 rev=rev+" "+s[k];
	}
		System.out.println(rev);
		
	}

}
