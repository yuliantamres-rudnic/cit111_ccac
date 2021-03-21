package citweek6;
import java.util.Scanner;

public class PurchaseCalculator {
	public static void main(String[] args) {
		
		//initializing variables and scanner
		double itemPrice;
		double discount;
		double limit; 
		double taxRate;
		Scanner userInput = new Scanner(System.in);
		
		//user input the initial dollar per unit amount
		System.out.println("Please enter the amount of dollars per unit: ");
		itemPrice = userInput.nextDouble();
		
		//user input for the spending limit
		System.out.println("Please enter your spending limit: ");
		limit = userInput.nextDouble();
		
		//user input for the tax rate
		System.out.println("And now for the tax rate: ");
		taxRate = userInput.nextDouble();
		
		//user input for the discount
		System.out.println("Are you taking advantage of any discounts?");
		discount = userInput.nextDouble();
		
		//the outputs with all the modifiers from the methods
		System.out.println("Hard-coded price value: $" + itemPrice);
		displayPriceWithTax(itemPrice, taxRate);
		computePriceAfterDiscount(itemPrice, discount);
		displayPurchaseableNumber(itemPrice, limit);
	}

	
	//price with tax method
	public static void displayPriceWithTax(double price, double taxRate) {
		double totalPrice = price * (1 + taxRate);
		System.out.println("Total price with tax: $" + totalPrice);
	}
	
	//price after discount method
	public static void computePriceAfterDiscount (double price, double discount) {
		double finalPrice = price -(price * discount);
		System.out.println("Price after discount: $" + finalPrice);
	}
	
	//Purchasable number method
	public static void displayPurchaseableNumber(double price, double limit) {
		int numPurchaseable = (int) Math.floor(limit / price);
		System.out.println("You limit is: $" + limit);
		System.out.println("Which will buy:" + numPurchaseable + " units");
	}
} //closes class
