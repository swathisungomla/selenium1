package inheritance;

public class IT  extends Employee{
	int bonus = 6000;
	

	public static void main(String[] args) {
		IT swathi= new IT();
		 
		System.out.println("the bonus of IT is = $ " + swathi.bonus);
	     System.out.println("the salary of IT is = $ " + swathi.salary);
        swathi.job();
		
		
	}

}
