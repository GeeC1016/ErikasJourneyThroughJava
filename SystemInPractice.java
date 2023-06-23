import java.util.Scanner;

class SystemInPractice {
	public static void main (String [] args) {

		//Create scanner object to get phrase
		Scanner getPhrase = new Scanner (System.in);
		
		//Prompt user to enter their phrase
		System.out.print("Please enter your phrase now: ");
		
		//User enters phrase 
		String yourPhrase = getPhrase.nextLine();

		System.out.println("Good choice! We will show you your phrase now. Please press enter key to continue");
		
		Scanner continueScanner = new Scanner (System.in);
		String continueKey = continueScanner.nextLine();

		//Return user phrase
		System.out.println("This is your Phrase: " + yourPhrase);

	}
}