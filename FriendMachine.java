package friendfinder;
import java.util.Scanner;

/**
 *
 * @author Yulian
 */

public class FriendMachine {
    public static void main(String[] args){
        //declaring initial variables
        int compScore = 0;
        final int COMP_THRESHOLD = 18;
        int userResponse = 0;
        Scanner inputScanner;
        Scanner stringScanner;
        String qaurterBack = "";
        String comedyMovie = "";
        int steelersRock = 0;   
        int replacement = 0; 
        boolean passedThreshold = false; 
        
        //I found that having multiple Scanners set up for separate input types
        //led to a more stable program
        inputScanner = new Scanner (System.in);
        stringScanner = new Scanner (System.in);
        
        //Taking the participants name to reference later in the responses
        String friendName = "";
        System.out.println("Hello, what is your name?");
        friendName = inputScanner.nextLine();
            
        String friendQuestion = "";
        System.out.println("Great the meet you " + friendName +" would you like"
                + " to be friends? Please type in all lowercase.");
        friendQuestion = inputScanner.next();
            compScore = compScore +1;
           
            //Binary input which if negative will terminate the program
        if (friendQuestion.equals("no")){
            System.out.println("Well I'm sorry to hear that, " + friendName);
            System.exit(0);
        }    
        if (friendQuestion.equals("yes")){
            System.out.println("Great! Lemme just ask you a few simple "
            +"questions to see if were going to be good pals! Just press 1 "
            + "for yes and 0 for no.");
            compScore = compScore + 2;
            
            //Binary input, followed by String input
            
             System.out.println("First Question: I'm a big fan of Comedy Movies,"
            + " how about yourself?");
            userResponse = inputScanner.nextInt();
                
            if (userResponse == 1){
                System.out.println("That's great, whats your favorite movie?");
                }
                comedyMovie = stringScanner.nextLine();
            
            if (comedyMovie.equals("shaun of the dead")){
                System.out.println("Great, thats my favorite movie to!");
                compScore = compScore + 10;
            } else {
                System.out.println("Yeah that movie is great!");
                compScore = compScore +3;
            }

            
            //Binary Input for Steelers question
        System.out.println("Second Question and this ones important: Do the "
        + "Steelers rock? Press 1 for yes, 0 for no."); 
            steelersRock = inputScanner.nextInt();
        
            
            //Calculating response to Steelers question followed by a string input
            
        if (steelersRock == 1){
            compScore = compScore +5;
            System.out.println("Darn tootin they do. Bet you can't tell me who"
            + " the quarterback is?");
            qaurterBack = stringScanner.nextLine();
        }//terminates steelers question
        
        //Switch input with variable compScore calculations
        if (qaurterBack.equals("ben roethlisberger")){
            System.out.println("Thats right, Big Ben himself! Now Ben is getting"
            + " close to retirement, which of these players do you think would "
            + " be the best replacement? Enter the corresponding number");
            System.out.println("1. Jameis Winston.");
            System.out.println("2. Sam Darnold.");
            System.out.println("3. Mathew Stafford.");
            
            replacement = inputScanner.nextInt();
            switch (replacement){
                case 1 -> { 
                    System.out.println("Nah, I think we can do better than Winston");
                    compScore = compScore -2;
                    }
                case 2 -> {
                    System.out.println("Yeah, I think Darnold is a good pick.");
                    compScore = compScore +3;
                }
                case 3 -> {
                    System.out.println("Absolutely, Stafford is my number 1 pick.");
                    compScore = compScore + 7;
                }   
            } //terminates switch
        
        } else {
            System.out.println("You don't even like football do you?");
            compScore = compScore - 10;
        }//terminates qaurterback tree
        }//terminates friend question tree
        
        
    //final tallying of compScore and response    
    System.out.println("Okay " + friendName + " I think we've gotten all the"
    + " information I need. You have scored " + compScore + "Friend Points.");
        if (compScore >= COMP_THRESHOLD){
            passedThreshold = true; 
            System.out.println("Well, " +friendName +" I think this is going to "
            + "be the start of a beautiful friendship!");
        } else {
            System.out.println("You know " + friendName +", you seem like a great"
            + "person and all but maybe we should see other people");
        }
    }//terminate main
}//terminate class  