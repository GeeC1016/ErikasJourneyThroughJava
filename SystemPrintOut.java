class SystemPrintOut {
	public static void main (String [] args){
		System.out.println("I'm printing random text to the screen");
		System.out.println("I'm printing random text to the screen");
		System.out.println("I'm printing random text to the screen");
		System.out.println("It's just my first lesson, so not super impressive... I know");
		System.out.println("But it can only get better from here... right?");

	Scanner getPhrase = new Scanner (System.in);
		
		System.out.println("Please enter your phrase now: ");
		
		String yourPhrase = getPhrase.nextLine();
		
		System.out.println("This is your Phrase: " + yourPhrase);
	}
}