package inheritance;

public class Accounttant  extends Employee{
	
	int bonus= 3000;
	

	public static void main(String[] args) {
		
		Accounttant dimbu = new Accounttant();
		
		System.out.println("the bonus of the Accounttant is = $ " + dimbu.bonus);
		System.out.println("the salary of the Accpunttant is = $ " + dimbu.salary);
		 dimbu.job();
		
		dimbu.add(2,3);

	}

}
