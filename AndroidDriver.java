// Coded by Jared Smith
// Second part of the Android Practicum problem on test
// Started 2/23/15

public class AndroidDriver {
// Creates a driver class
	public static void main(String [] args) {
// Gives it a main method to run
		Android phone = new Android();
		System.out.println(phone.toString());
// Defines phone with 0 parameters and prints it
		Android gs = new Android("Galaxy S5", "Lolipop", 2);
		System.out.println(gs.toString());
// Defines phone with three parametes and prints
		Android lgg = new Android("LG G3", "KitKat");
		System.out.println(lgg.toString());
// Defines phone with 2 parameters and prints
		Android lgf = new Android("LG Optimus F3");
		System.out.println(lgf.toString());
// Defines phone with 1 parameter and prints
	}
// Closes off the main method
}
// Closes off the class
