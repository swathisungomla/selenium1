package demo;

public class Calculator1 {
	
	public void add(int a , int b){
	System.out.println(a+b);
	}
	public int add1(int a, int b){      //int return type
		return (a+b);
				
	}
	
	public void sub(int a, int b){       // void return type
		System.out.println(a-b); 
		}                               /* this program is for difference between return type int
		                                  and void....*/
	
	public void mul(int a, int b){
		System.out.println(a*b);
	}
	public void div(int a,int b){
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		Calculator1 basicCal= new Calculator1();
		
		basicCal.add(2,3);
		System.out.println(basicCal.add1(2,3));
		basicCal.sub(5, 4);
		basicCal.mul(3, 5);
		basicCal.div(15, 5);
		
	}

}
