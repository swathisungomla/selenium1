package collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> family = new ArrayList<String>();
		family.add("swathi");
		family.add("shravan");
		family.add("riyansh");
		family.add("amma");
		family.add("nanna");
		family.add("chelli");
		family.add("mama");
		family.add("atha");
		System.out.println("all family names are = " +family); // this is one more way to print all ( elements)family members
		
		family.remove("atha");
		family.remove("mama"); //this way we can remove elements from arraylist
		 
		family.add(5, "chinnu"); // this way we can add more elements
		
		System.out.println("All family numbers from swathi side are =" + family);
		
		
		
		
		
	}

}
