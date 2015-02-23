// Coded by Jared Smith
// Practicum from the test, Android class
// Coded on 2/23/15

public class Android {
	public String make;
	public String os;
	public int quantity;
// Creates a class named Android and gives it three things to look for
// make, operating system, and quantity

// Data above
// -------------------------------------------------
// Behavior below

// Zero parameter constructor
	Android() {
		make = "No make specified";
		os = "No operating system specified";
		quantity = 1;
	}

// One parameter constructor
	Android(String thisMake) {
		this();	
		make = thisMake;
	}

// Two parameter constructor
	Android(String thisMake, String thisOS) {
		this();
		make = thisMake;
		os = thisOS;
	}
	
// Three parameter constructor
	Android(String thisMake, String thisOS, int thisQuantity) {
		make = thisMake;
		os = thisOS;
		quantity = thisQuantity;
	}

// toString method

	public String toString() {
		String output = "";
		output = "Make: " + make + "| Operating System: " + os + "| Quantity: " + quantity;
		return output;
	}
}
