package DemoPackage;

public class DemoClass extends A {
	
	public static void method1() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		A a = new A();
		a.method1();
		DemoClass d1 = new DemoClass();
		d1.method1();
		
		A a1 = new DemoClass();
		
		a1.method1();
		
		
		
		

	}

}

class A{
	  public static void  method1() {
		System.out.println("parent Class");
	}
}


 abstract class A1{
	 
	 abstract void m1();
 }
 
 class A2 extends A1{
void m1() {
 
 }}
 
 
 
 interface I1{
	 void m2();
	 void m3();
	 
 }
 
 
 class Demo1 implements I1{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	 
	 
 
 }