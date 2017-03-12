package inheritance;

public class Security extends Employee{
	
        int bonus=4000;
	

	public static void main(String[] args) {
		
		Employee soppa = new Employee();  /* here i created object for parent class so it is 
		                                      giving output as parent class bonus*/
		                                    
		System.out.println("the bonus is =" + soppa.bonus);	

	}

}
