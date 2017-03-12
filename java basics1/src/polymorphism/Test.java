package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Employee swathi = new IT();
		Employee shravan = new Accounts();
		Employee riyansh = new Security();
		Employee2 amma = new Security();
		Employee2 nanna = new Accounts();
		
		swathi.message();
		shravan.message();
		riyansh.message();
		amma.message2();
		nanna.message2();
		Accounts x = new Accounts();
		  x.day();
		
		

	}

}
