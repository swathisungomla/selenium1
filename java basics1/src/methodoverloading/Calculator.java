package methodoverloading;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a + b);

	}

	public void add(int a, int b,int c) { /* this program is for method overloading( it as same method
	                                       name  but different parameters */
		System.out.println(a + b + c);
	}

	public void add(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {

		Calculator basicCal = new Calculator();
		basicCal.add(2, 3);
		basicCal.add(2, 4, 4);
		basicCal.add(3);

	}

}
