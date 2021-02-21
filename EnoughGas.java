package citweek4;
import java.util.Scanner;

/**
 *
 * @author Yulian
 */

public class EnoughGas {
    public static void main(String[] args){
        //declaring our varibles
        double MILES_PER_GALLON;
        double gasRemaining; 
        double stationDistance;
        
        //creating the input scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        //Gathering inputs for our variables
        System.out.println("How many gallons of gas you got left pardner?");
            gasRemaining = userInputScanner.nextDouble();
        //Giving an error message if a user inputs a negative value
        if (gasRemaining  < 0) {
            System.out.println("Incorrect Input pardner.");
        }
        System.out.println("Well shucks, how many miles to the next gas station?");
            stationDistance = userInputScanner.nextDouble();
        if (stationDistance < 0){
            System.out.println("Incorrect Input pardner.");
        }
        System.out.println("Golly champ, how many miles per gallon does your vehicle rock?");
            MILES_PER_GALLON = userInputScanner.nextDouble();
        if (MILES_PER_GALLON < 0){
            System.out.println("Incorrect Input pardner.");
        }
        
        //simplifying the math for the logic statement
        double travelDistance = (gasRemaining*MILES_PER_GALLON);
        double distanceRemainder =(stationDistance%travelDistance);
        
        
        //the logic statement to identify our gas situation
        if(travelDistance >= stationDistance){
            System.out.println("You lucky fella, you'll get to the next station!");
        }else{
            System.out.println("Well tarnation fella, you're soon to be marooned out here!");
            System.out.println("By my reckonin the next gas station is about: " 
                    +distanceRemainder +"miles down the road");
           }//closes if/else tree
    }//closes main
}//closes class
