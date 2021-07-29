package VarargsPack;

class Calc {

	int sum = 0;

	public int add(int... i) // variable length arguments
	{
		for (int n : i) {
			sum = sum + n;

		}
		return sum;
	}

}

public class VarargsClass {

	public static void main(String[] args) {
		Calc obj = new Calc();

		System.out.print(obj.add(8, 5, 3, 9, 4, 2, 8));

	}

}
