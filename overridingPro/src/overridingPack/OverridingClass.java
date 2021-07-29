package overridingPack;

class A {
	int i;

	public void show() {
		System.out.println("in A");
	}
}

class B extends A {
	@Override
	// sub class show method overrides super class show method for that we need to
	// user "super"keyword
	// super can be used for variables also

	public void show() {
		int i = 1;
		super.i = 10;

		super.show();
		System.out.println("in B");
	}
} 

public class OverridingClass {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();

	}

}
