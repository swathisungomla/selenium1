package methodoverriding;

public class Security extends Employee{
	
	
	public void message(){    // here the method is overridden is implemented
		
		System.out.println("All the employees will get 3 WFH from next month");
	}

	public static void main(String[] args) {
		
		Security patel = new Security();
		 patel.message();  /* here we called message method but it also has 
		                       same method name in parent class but still child class take preference
		                       first and output will be from child class*/

	}

}
