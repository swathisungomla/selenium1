package methodoverloading;

public class Calculator1 {
	
	public void add(int a , int b){
		System.out.println(a+b);
	}
	public void add(int a, int b, int c){
		System.out.println(a+b+c);
		
	}
	public void add(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		Calculator basicCal= new Calculator();
		basicCal.add(3,2);
		basicCal.add(1,2,3);
		basicCal.add(3);
		
		
	}

}
