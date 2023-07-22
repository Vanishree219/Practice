package DemoPackage;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		 Student s1 = new Student("A",1);
		 Student s2 = new Student("B",2);
		 
		 al.add(s1);
		 al.add(s2);
		 
		 for(int i=0;i<al.size();i++) {
			 Student s = (Student) al.get(i);
			 
			 System.out.println(al.get(i));
			 
		 }

	}

}





class Student{
	
	String name;
	
	int age;
	
	public Student(String name, int age){
		this.name=name;
		this.age = age;
	}
}