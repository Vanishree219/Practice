package DemoPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

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
	
	public void stringCount() {
		String s = "Vanishree";
		
		LinkedHashMap<Character, Integer> ma = new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++) {
			if(ma.containsKey(s.charAt(i))==false) {
				ma.put(s.charAt(i), 1);
			}
			else {
				ma.put(s.charAt(i), ma.get(s.charAt(i))+1);
			}
		}
		String s1="";
		for(Map.Entry<Character, Integer> e :ma.entrySet()) {
			String s2=String.valueOf(e.getKey())+String.valueOf(e.getValue());
			s1=s1+s2;
			
		}
		
		Set se = (Set) ma.keySet();
		ArrayList al2 = new ArrayList(se);
		
		Collection al = (Collection) ma.values();
		ArrayList al3 = new ArrayList(al);
		
		StringBuilder s34 = new StringBuilder();
		
		for(int i=0;i<al.size();i++) {
			String s3=String.valueOf(al2.get(i))+String.valueOf(al3.get(i));
			
			s34.append(s3);			
		}
		System.out.println(s34);
	}
	
	public void numberToWords(int num) {
		
		String arr[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "Nine", "Ten", "eleven", "twelv", "thirteen","fourteen", "fivteen",
				"sixteen", "seventeen", "eighteen", "nineteem"};
		
		
		
		
		LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<>();
		
		for(int i=1;i<=arr.length;i++) {
			hm1.put(i, arr[i-1]);
			
		
		}
		
		LinkedHashMap<Integer, String> hm2 = new LinkedHashMap<>();
		
		String arr2[]= {"ten","twenty","thirty", "fourty", "fifty","sixty","seventy","eighty","ninety" };
		
		for(int i=1;i<=arr2.length;i++) {
			hm2.put(i, arr2[i-1]);
			
		
		}
		LinkedHashMap<Integer, String> hm3 = new LinkedHashMap<>();
		String arr3[]= {"onehundred", "twohundre","threehundred", "fourhundred", "fivehundred",
				"sixhundred","sevenhundred", "eighthundred","ninehundred"};
		
		for(int i=1;i<=arr3.length;i++) {
			hm3.put(i, arr3[i-1]);
			
		
		}
		
		if(num<19) {
			for(Map.Entry<Integer,String> me:hm1.entrySet()) {
				
				if(me.getKey()==num) {
					System.out.println(me.getValue());
				}
				
			}
			
		}
		else if(num>19 && num<100) {
			
			String s1 = String.valueOf(num);
			
			
			String twodigit = "";
			for(Map.Entry<Integer,String> me:hm2.entrySet()) {
				
				if(String.valueOf(me.getKey()).equals(String.valueOf(s1.charAt(0)))) {
					
					
					twodigit = me.getValue();
				}
				
			}
			
			for(Map.Entry<Integer,String> me:hm1.entrySet()) {
				
				if(String.valueOf(me.getKey()).equals(String.valueOf(s1.charAt(1)))) {
					
					twodigit = twodigit+ me.getValue();
				}
				
			}
			
			System.out.println(twodigit);
			
			
			
		}
		else {
			
			String s1 = String.valueOf(num);
			
			
			String threedidgit = "";
			
			for(Map.Entry<Integer,String> me:hm3.entrySet()) {
				
				if(String.valueOf(me.getKey()).equals(String.valueOf(s1.charAt(0)))) {
					
					threedidgit = me.getValue();
				}
				
			}
			for(Map.Entry<Integer,String> me:hm2.entrySet()) {
				
				if(String.valueOf(me.getKey()).equals(String.valueOf(s1.charAt(1)))) {
					
					threedidgit =threedidgit+ me.getValue();
				}
				
			}
			
			for(Map.Entry<Integer,String> me:hm1.entrySet()) {
				
				if(String.valueOf(me.getKey()).equals(String.valueOf(s1.charAt(2)))) {
					
					threedidgit = threedidgit+ me.getValue();
				}
				
			}
			
			System.out.println(threedidgit);
			
		}
		
		
	}
}
