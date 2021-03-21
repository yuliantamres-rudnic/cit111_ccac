package citweek6;
import java.util.Scanner;


//@Author Yulian

public class MysteryDoors {
	@SuppressWarnings("resource")
	//Here we declare the variables and scanner used for initial data collection, separated into groups based on the method they're drawn from
	static Scanner keyboardScanner = new Scanner(System.in);
	
	static boolean endsMeans;
	static boolean obligation;
	static boolean pleasurePain;
	
	static boolean effortResults;
	static boolean artGenre;
	static boolean beautiful;
	
	static boolean causeEffect;
	static boolean staticDynamic;
	static boolean mindBody;
	
	
	//The main method, includes an introduction and a looping questions menu 
	public static void main(String[] args) {
		int selection;
		
		System.out.println("Hello, I read alot of books and can offer you an interesting reading recommendation if you would like to answer a few questions.");
		System.out.println("Simply choose a topic and answer true or false. When you're done with each section please continue to the next section, or repeat a section if you'd like."
				+ " When you've answered all you want simply request the results and you'll recieve a book recommendation.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1. Ethics");
		System.out.println("2. Aesthetics");
		System.out.println("3. Metaphysics");
		System.out.println("4. Final Reccomendation");
		
		
		//This is the initial selection switch, it is set to loop back to itself on any case except 4 
		choices: while(true) {
			selection = keyboardScanner.nextInt();
			
			switch(selection) {
			case 1:
				System.out.println("Ethics");
				ethics();
				//System.out.format("Results R: %b %b %b\n", obligation, endsMeans, pleasurePain);
				System.out.println("You're all done with Ethics.");
				break;
			case 2:
				System.out.println("Aesthetics");
				aesthetics();
				System.out.println("You're all done with Aesthetics.");
				break;
			case 3:
				System.out.println("Metaphysics");
				metamemes();
				System.out.println("You're all done with Metaphysics.");
				break;
			case 4:
				results();
				break choices;
			default: 
				System.out.println("Please choose one of the options");
				break;
			}
		}//closes
	}//closes main method
	
	
	//Method to output questions on ethics
	public static void ethics() {
		System.out.println("This is a few quick questions on ethics");
		System.out.println("Do you think that the ends justify the means?");
		endsMeans = keyboardScanner.nextBoolean();
		
		System.out.println("Do you think you have an obligation to help others?");
		obligation = keyboardScanner.nextBoolean();
		
		System.out.println("Do you think its right to maximuize pleasure and minimize pain?");
		pleasurePain = keyboardScanner.nextBoolean();
		
	}//closes ethics method
	
	//method to output questions on aesthetics
	public static void aesthetics() {
		System.out.println("This is a few quick questions on aesthetics.");
		System.out.println("Do you think that effort is more important than results?");
		effortResults = keyboardScanner.nextBoolean();
		//output response if conditions are met
		if (endsMeans == true && effortResults == false) {
			System.out.println("Very goal oriented aren't you");
		}
		
		System.out.println("Can art be categorized by genre or not?");
		artGenre = keyboardScanner.nextBoolean();
		
		System.out.println("Can the grotesque also be beautiful?");
		beautiful = keyboardScanner.nextBoolean();
		
	}//closes aesthetics method
	
	//methods to output questions on metaphysics
	public static void metamemes() {
		System.out.println("This is a few quick questions on metaphysics.");
		System.out.println("Do you think that there is anything independent of cause and effect?");
		causeEffect = keyboardScanner.nextBoolean();
		
		System.out.println("Can you walk through the same river twice?");
		staticDynamic = keyboardScanner.nextBoolean();
		
		System.out.println("Does the mind precede the body?");
		mindBody = keyboardScanner.nextBoolean();
		
	}//closes the metamemes methods
	
	//final recommendation method, draws input data that is stored in the class to change recommendations
	public static void results() {
		
		//declaring recommendation variables, starts at false
		boolean mill = false;
		boolean parmenides = false;
		boolean aristotle = false;
		boolean epicurious = false;
		
		//drawing variables stored in the class to adjust the recommendation variables
		if (endsMeans == true && artGenre == true && effortResults == false) {
			mill = true;
		} if (causeEffect == false && mindBody == false) {
			parmenides = true;
		} if (causeEffect == true && beautiful == true) {
			aristotle = true;
		} if (pleasurePain == true) {
			epicurious = true;
		}
		
		//the final result, different outputs depending on which recommendation variables are altered
		System.out.println("Here is a book I think you'd really like:");
		if(mill == true) {
			System.out.println("Utilitarianism by John Stuart Mill");
		}if(parmenides == true) {
			System.out.println("On Nature by Parmenides");
		}if (aristotle == true) {
			System.out.println("Nicomachean Ethics by Aristotle");
		}if (epicurious == true){
			System.out.println("The Complete works of Epicurus by Epicurus, collected by Anthony Martinez");
		} else {
			System.out.println("Harry Potter by J.K. Rowling");
		}
		
	} //closes recoommendation method
	}// closes class