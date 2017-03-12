package demo;

public class Shapes1 {
	
	int length;               /*  this program is for parameterized constructor*/
	int breadth;
	int height;
	
	public Shapes1(int a,int b, int c){   // here we created parameterized constructor
		length=a;
		breadth=b;
		height=c;
		
		
		}
	
	public void area(){
		System.out.println("The area of the rectangle is" + (length*breadth) +" The height of the rectangle is " + (height));
	
	}
		
		
	

	public static void main(String[] args) {
		
		Shapes1 rectangle1 = new Shapes1(7, 4, 5);
		 rectangle1.area();
		 
		
		

	}

}
