package polymorphism;

public class Accounts  extends Employee implements  Employee2{

	@Override
	public void message() {
		
   System.out.println("All the employess from Accounts department will get 3 WFH");
		
	}

	@Override
	public void message2() {
		System.out.println("All the employees will get 3 extra days of holidays");
		
	}
	public void day(){
		System.out.println(" hiiiiiii");
		
	
	

}
  public  static void main(String[] args){
	  
	  Accounts x = new Accounts();
	  x.day();
	  
  }
}
