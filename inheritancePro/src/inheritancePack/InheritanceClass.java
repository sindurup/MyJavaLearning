package inheritancePack;

class A {
	public A() {
		System.out.println("In A");
	}

	public A(int i) {
		System.out.println("In A int");
	}
}

class B extends A {
	public B() {
		System.out.println("In B");
	}

	public B(int i) {
		/*
		 * if we dont pass parameters for super it will call default constructor
		 */
		super(i);
		System.out.println("In B int");
	}
}

public class InheritanceClass {

	public static void main(String[] args) {
		B obj = new B(); // out put is In A In B

		/*
		 * out put is In A In B int because derived class constructor calls default
		 * super() constructor for that we have to call super(i)
		 * 
		 */

		B obj1 = new B(6);

	}

}
