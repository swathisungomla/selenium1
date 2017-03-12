package inheritance;

public class HR extends Employee{
	
	int bonus = 2000;
	

	public static void main(String[] args) {
		
    HR prabha = new HR();
     System.out.println("the bonus of HR = $ " + prabha.bonus);
     System.out.println("the salary of HR = $ " + prabha.salary);
     

	}

}
