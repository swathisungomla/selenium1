package demo;

public class Calculator {
	
	public void add(int a,int b, int c) {    //a and b are formal parameters
	
		System.out.println(a+b+c);	
	}                                 // THIS PROGRAM IS FOR METHODS
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	public void mul(int e,int r){
		System.out.println(e*r);
			
		
	}
	public void div(int a ,int b, int c){
		System.out.println(a/b/c);
	}
	
	

	public static void main(String[] args) {
		Calculator basicCal= new Calculator(); // we created an object
		basicCal.add(2,4,3);          //add method is called by using object
		basicCal.sub(4,2);     // all the values given here are actual parameters
		basicCal.mul(2,4);
		basicCal.div(12,6, 2);
		
		
		
		// TODO Auto-generated method stub

	}

}
