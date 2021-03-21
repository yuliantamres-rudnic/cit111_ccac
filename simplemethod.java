package citweek6;

public class simplemethod {
	public static void main(String[] args) {
		System.out.println("This code is inside method: main");
		
		printStatement();
		
		System.out.println("...back in main");
		
		
	}//close main
	
	public static void printStatement() {
		System.out.println("~~~~~~~You've Chosen The First Option~~~~~~~~");
		System.out.println("Statement Where There's a Will, There's a Way");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}//close printStatement
}//close class
