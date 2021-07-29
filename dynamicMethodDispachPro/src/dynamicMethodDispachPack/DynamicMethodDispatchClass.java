package dynamicMethodDispachPack;

class A {
	public void show() {
		System.out.println("in A");
	}
}

class B extends A {
	public void show() {
		System.out.println("in B");
	}
}

class C extends A {
	public void show() {
		System.out.println("in C");
	}
}

public class DynamicMethodDispatchClass {

	public static void main(String[] args) {

		A obj = new B(); // runtime

		obj.show(); // out put is "in B" because we are creating object for class B
		obj = new C();// changing obj is called dynamic method dispatch
		obj.show();// out put is "in C" because we are creating object for class C

	}

}
