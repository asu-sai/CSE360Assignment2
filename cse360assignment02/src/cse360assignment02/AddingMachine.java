package cse360assignment02;

public class AddingMachine {
	// declaring variables
	private int total = 0;;
	private String fullString = "0";
  
	// main method used for testing
	/*public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add (4); 
		myCalculator.subtract (2); 
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
    }*/
	
	// constructor that initializes variable
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
  
	// method that returns the total
	public int getTotal () {
		return total;
	}
  
	// method that adds the parameter "value" to the total
	// adds the addition symbol as well as the value to fullString
	public void add (int value) {
		total += value;
		fullString += " + " + value; 
	}

	// method that subtracts the parameter "value" from the total
	// adds the subtraction symbol as well as the value to fullString
	public void subtract (int value) {
		total -= value;
		fullString += " - " + value; 
	}

	// prints the output in the required formatting
	public String toString () {
		return fullString;
	}

	// clears value
	public void clear() {
		fullString = "";
	}
}