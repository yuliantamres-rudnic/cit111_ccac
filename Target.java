package robinhood;

public class Target {

	public static void main(String args[]) throws InterruptedException {
		int power= 0;
		int drift= 0;
		Shoot firstShot;
		Shoot secondShot;
		Shoot thirdShot;
		
		System.out.println("Welcome to the Sherwood Archery Tournament");
		System.out.println("Please step right up and take your best shot!");
		
		firstShot = new Shoot();
		firstShot.runTourney();
		
		
	}//end Main
	
	
}//