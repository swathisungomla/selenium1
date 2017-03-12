package polymorphism;

public class Security extends Employee implements Employee2{

	@Override
	public void message() {
		System.out.println(" All the employees FROM SECURITY DEPARTMENT will get 7 WHM");
		
	}

	@Override
	public void message2() {
		
		System.out.println("All the employees will get 4 extra days of leaves");
	}
	
	
	
	

}
