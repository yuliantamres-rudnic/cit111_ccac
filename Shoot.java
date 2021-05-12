package robinhood;
import java.util.Scanner;

public class Shoot {
	
	static Scanner keyboardScanner = new Scanner(System.in);
	static int power = 1;
	static int drift = 0; 
	
	public void runTourney() throws InterruptedException {
		chooseBow();
		generateWind();
		generateWind();
		generateWind();
		generateWind();
		generateWind();
		generateWind();
		prepareShot();
	}//end runTourney
	
	public static int chooseBow() {
		int selection;
		System.out.println("First, please choose a bow.");
		System.out.println("1- An accurate Recurve Bow");
		System.out.println("2- A powerful Long Bow");
		System.out.println("3- A comfortable Pinewood Bow");
		
		choices: while(true) {
			selection = keyboardScanner.nextInt();
			switch(selection) {
			case 1:
				power = power + 1;
				break choices;
			case 2:
				power = power + 3;
				break choices;
			case 3:
				power = power - 2; 
				break choices;
			default:
				System.out.println("You must choose a bow to enter the tournament");
			}//end switch
		}//end choices
		return power;
	}//end chooseBow
	public static int generateWind() {
		int min = 0;
		int max = 4;
		
		int wind = (int)Math.floor(Math.random()*(max-min+1)+min);
		
		if (wind == 1) {
			drift = drift + 0; 
		} if (wind == 2) {
			drift = drift + 1;
		} if (wind == 3) {
			drift = drift - 1;
		} if (wind== 4) {
			drift = drift + 2;
		} if (wind == 5) {
			drift = drift - 2;
		} //end if thread
		return drift;
	}//end generateWind
	
	@SuppressWarnings("unused")
	public static int prepareShot() throws InterruptedException {
		int selection;
		int draw;
		System.out.println("Its time to take your shot... how do you want to go about this?");

		System.out.println("1- Check Wind");
		System.out.println("2- Aim your shot");
		System.out.println("3- Draw your bow");
		System.out.println("4- Loose your arrow");
		
		choices: while(true) {
			selection = keyboardScanner.nextInt();
			
			switch(selection) {
			case 1: 
				checkWind();
				System.out.println("1- Check Wind");
				System.out.println("2- Aim your shot");
				System.out.println("3- Draw your bow");
				System.out.println("4- Loose your arrow");
				break;
			case 2:
				adjustAim();
				System.out.println("1- Check Wind");
				System.out.println("2- Aim your shot");
				System.out.println("3- Draw your bow");
				System.out.println("4- Loose your arrow");
				break;
			case 3: 
				drawBow();
				System.out.println("1- Check Wind");
				System.out.println("2- Aim your shot");
				System.out.println("3- Draw your bow");
				System.out.println("4- Loose your arrow");
				break;
			case 4:
				fireArrow();
				showTarget();
				niceShot();
				break;
			default:
				break;
			}//close switch (selection)
		}//close menu
	}//end shootArrow
	
	public static void checkWind() {
		if (drift >= 2) {
			System.out.println("The wind is blowing heavily to the left");
		}if (drift == 1) {
			System.out.println("The wind is blowing slightly to the left");
		}if (drift == 0) {
			System.out.println("The wind is completely still");
		}if (drift == -1) {
			System.out.println("The wind is blowing slightly to the right");
		}if (drift <= -2) {
			System.out.println("The wind is blowing heavily to the right");
		}
	}//close checkWind()
	
	public static int adjustAim() {
		
		int adjust;
		
		System.out.println("Which way do you wish to adjust?");
		System.out.println("1- Hard to to the right");
		System.out.println("2- Hard to the left");
		System.out.println("3- Slightly to the right");
		System.out.println("4- Slightly to the left");
		System.out.println("5- Dead center");
		adjust = keyboardScanner.nextInt();
		
		if (adjust == 1) {
			drift = drift + 3;
		} if (adjust == 2) {
			drift = drift - 3;
		} if (adjust == 3) {
			drift = drift + 2;
		} if (adjust == 4){
			drift = drift - 2;
		} if (adjust == 5) {
			drift = drift -1 +1;
		}
		return drift;
	}//close adjustAim()
	
	public static int drawBow() {
		int draw;
		System.out.println("How far back do you want to draw your bow string?");
		System.out.println("1- Pull it back the bare minimum");
		System.out.println("2- Pull it back a decent amount");
		System.out.println("3- Pull it back as hard as you can");
		
		draw = keyboardScanner.nextInt();
		
		if (draw == 1) {
			power = power + 1;
		} if (draw == 2) {
			power = power + 3;
		} if (draw == 3) {
			power = power + 5;
		} //close if thread
		return power;
	}//close drawBow
	
	public static void fireArrow() throws InterruptedException {
		System.out.println("                                                       |\r\n"
				+ "                                                        \\.\r\n"
				+ "                                                        /|.\r\n"
				+ "                                                      /  `|.\r\n"
				+ "                                                    /     |.\r\n"
				+ "                                                  /       |.\r\n"
				+ "                                                /         `|.\r\n"
				+ "                                              /            |.\r\n"
				+ "                                            /              |.\r\n"
				+ "                                          /                |.\r\n"
				+ "     __                                 /                  `|.\r\n"
				+ "      -\\                              /                     |.\r\n"
				+ "        \\\\                          /                       |.\r\n"
				+ "          \\\\                      /                         |.\r\n"
				+ "           \\|                   /                           |\\\r\n"
				+ "             \\#####\\          /                             ||\r\n"
				+ "         ==###########>     /                               ||\r\n"
				+ "          \\##==      \\    /                                 ||\r\n"
				+ "     ______ =       =|__/___                                ||\r\n"
				+ " ,--' ,----`-,__ ___/'  --,-`-==============================##==========>\r\n"
				+ "\\               '        ##_______ ______   ______,--,____,=##,__\r\n"
				+ " `,    __==    ___,-,__,--'#'  ==='      `-'              | ##,-/\r\n"
				+ "   `-,____,---'       \\####\\              |        ____,--\\_##,/\r\n"
				+ "       #_              |##   \\  _____,---==,__,---'         ##\r\n"
				+ "        #              ]===--==\\                            ||\r\n"
				+ "        #,             ]         \\                          ||\r\n"
				+ "         #_            |           \\                        ||\r\n"
				+ "          ##_       __/'             \\                      ||\r\n"
				+ "           ####='     |                \\                    |/\r\n"
				+ "            ###       |                  \\                  |.\r\n"
				+ "            ##       _'                    \\                |.\r\n"
				+ "           ###=======]                       \\              |.\r\n"
				+ "          ///        |                         \\           ,|.\r\n"
				+ "          //         |                           \\         |.\r\n"
				+ "                                                   \\      ,|.\r\n"
				+ "                                                     \\    |.\r\n"
				+ "                                                       \\  |.\r\n"
				+ "                                                         \\|.\r\n"
				+ "                                                         /.\r\n"
				+ "                                                        |");
		Thread.sleep(2000);
		System.out.println("                                               ||     |\r\n"
				+ "                                                        ||     \\.\r\n"
				+ "                                                        ||       |.\r\n"
				+ "                                                        ||      `|.\r\n"
				+ "                                                        ||        |.\r\n"
				+ "                                                        ||        |.\r\n"
				+ "                                                        ||       `|.\r\n"
				+ "                                                        ||         |.\r\n"
				+ "                                                        ||          |.\r\n"
				+ "                                                        ||          |.\r\n"
				+ "     __                                                 ||         `|.\r\n"
				+ "      -\\                                               ||          |.\r\n"
				+ "        \\\\                                            ||          |.\r\n"
				+ "          \\\\                                          ||          |.\r\n"
				+ "           \\|                                          ||         |\\\r\n"
				+ "             \\#####\\                                  ||         ||\r\n"
				+ "         ==###########>                                 ||        ||\r\n"
				+ "          \\##==      \\                                ||        ||\r\n"
				+ "     ______ =       =|__/___                            ||        ||\r\n"
				+ " ,--' ,----`-,__ ___/'  --,-`                           ||        ||\r\n"
				+ "\\               '        ##_______ ______   ______,--,_||___,=##,__\r\n"
				+ " `,    __==    ___,-,__,--'#'  ==='      `-'            ||| ##,-/\r\n"
				+ "   `-,____,---'       \\####                |        ___||_,--\\_##,/\r\n"
				+ "       #_              |##      ,_____,---==,__,---'    ||     ##\r\n"
				+ "        #              ]===--=='                        ||      ||\r\n"
				+ "        #,             ]                                ||      ||\r\n"
				+ "         #_            |                                ||     ||\r\n"
				+ "          ##_       __/'                                ||      ||\r\n"
				+ "           ####='     |                                 ||      |/\r\n"
				+ "            ###       |                                 ||       |.\r\n"
				+ "            ##       _'                                 ||      |.\r\n"
				+ "           ###=======]                                  ||      |.\r\n"
				+ "          ///        |                                  ||     ,|.\r\n"
				+ "          //         |                                  ||     |.\r\n"
				+ "                                                        ||   ,|.\r\n"
				+ "                                                        ||   |.\r\n"
				+ "                                                        ||  |.\r\n"
				+ "                                                        || |.\r\n"
				+ "                                                         /.\r\n"
				+ "                                                        |");	

	}//end fireArrow
	public static void showTarget() {
		System.out.println("        			 ??????????????                            \r\n"
				+ "                          ????????????????????????????                    \r\n"
				+ "                    ??????????????????????????????????????                \r\n"
				+ "                ????????????????????????????????????????????              \r\n"
				+ "        	    ??????????????????                ????????????????          \r\n"
				+ "      	???????????????                              ????????????        \r\n"
				+ "      ??????????????   3;E                                ??????????      \r\n"
				+ "      ??????????        3;E       ??????????                ????????      \r\n"
				+ "      ????????           3;E   ????????????????????            ????????    \r\n"
				+ "      ????????	         \\?????????????????????????            ??????    \r\n"
				+ "      ????????  	      ????\\?????????????????????????            ????????  \r\n"
				+ "    ????????      	???????\\?????          ????????????          ??????  \r\n"
				+ "    ??????        ???????????\\?                 ??????????         ??????  \r\n"
				+ "    ??????      ????????????  \\                    ??????????        ????????\r\n"
				+ "  ??????        ???????????	  \\                    ????????           ??????\r\n"
				+ "  ??????        ??????????      \\  ??????            ??????           ??????\r\n"
				+ "  ??????      ??????????   	   ?\\???????????         ????????        ??????\r\n"
				+ "  ??????      ??????????        ??\\???????????         ????????       ??????\r\n"
				+ "????????      ??????????        ??????????????          ????????        ??????\r\n"
				+ "  ??????      ??????????        ??????????????          ????????        ??????\r\n"
				+ "  ??????      ??????????        ?????????????          ????????        ??????\r\n"
				+ "  ??????      ??????????          ??????????          ??????         ??????\r\n"
				+ "  ??????  	  ??????????                          ????????          ??????\r\n"
				+ "  ?????????		??????????	                     ??????????  	    ??????  \r\n"
				+ "    ???????		?????????????                  ?????????? 	       ??????  \r\n"
				+ "    ?????????		?????????????              ??????????        ??????  \r\n"
				+ "    ??????????		  ????????????????????????????????          ??????    \r\n"
				+ "      ??????????			?????????????????????????             ????????    \r\n"
				+ "      ???????????		    ????????????????????            ????????      \r\n"
				+ "        ????????????									 	  ??????????      \r\n"
				+ "          ???????????							         ??????????        \r\n"
				+ "          ????????????									?????????          \r\n"
				+ "            ??????????????????????????????????????????????????            \r\n"
				+ "              ??????????????????????????????????????????????              \r\n"
				+ "                    ????????????????????????????????????                  \r\n"
				+ "                            ???????????????????? ");
	}//end Show Target
	public static void niceShot(){
		System.out.println(" ________   ___  ________  _______           ________  ___  ___  ________  _________  ___       \r\n"
				+ "|\\   ___  \\|\\  \\|\\   ____\\|\\  ___ \\         |\\   ____\\|\\  \\|\\  \\|\\   __  \\|\\___   ___\\\\  \\      \r\n"
				+ "\\ \\  \\\\ \\  \\ \\  \\ \\  \\___|\\ \\   __/|        \\ \\  \\___|\\ \\  \\\\\\  \\ \\  \\|\\  \\|___ \\  \\_\\ \\  \\     \r\n"
				+ " \\ \\  \\\\ \\  \\ \\  \\ \\  \\    \\ \\  \\_|/__       \\ \\_____  \\ \\   __  \\ \\  \\\\\\  \\   \\ \\  \\ \\ \\  \\    \r\n"
				+ "  \\ \\  \\\\ \\  \\ \\  \\ \\  \\____\\ \\  \\_|\\ \\       \\|____|\\  \\ \\  \\ \\  \\ \\  \\\\\\  \\   \\ \\  \\ \\ \\__\\   \r\n"
				+ "   \\ \\__\\\\ \\__\\ \\__\\ \\_______\\ \\_______\\        ____\\_\\  \\ \\__\\ \\__\\ \\_______\\   \\ \\__\\ \\|__|   \r\n"
				+ "    \\|__| \\|__|\\|__|\\|_______|\\|_______|       |\\_________\\|__|\\|__|\\|_______|    \\|__|     ___ \r\n"
				+ "                                               \\|_________|                                |\\__\\\r\n"
				+ "                                                                                           \\|__|\r\n"
				+ "                                                                                                ");
	}//end niceShot
	public static int returPower() {
		return power;
	}//end returPower
	public static int returDrift() {
		return drift;
	}//end returDrift
}//end class Shoot