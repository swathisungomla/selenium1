package demo;

public class Shapes {
	
	int length;
	int breadth;
	int height;
	
	public Shapes(){   // here we created constructor,,,this is default constructor
		
		length = 3;
		breadth = 5;    // this program is for constructors
		height = 7;
		
	}
	public void area(){
		System.out.println("the area of the rectangle is " + (length*breadth) + " the height is "  + (height));
	}
	
	

	public static void main(String[] args) {
		Shapes Rectangle = new Shapes();
		Rectangle.area();
		
		
		
		
	}

}
