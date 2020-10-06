package cse360assignment02;

public class AddingMachine {
	 /**
	   * The total and history variables
	   */
	  private int total;
	  private String History;	
	  
	  /**
	   * Represents a calculator and its actions
	   * Initiates both the total and history with 0 or nothing
	   */
	  public AddingMachine () {
		  total = 0;
		  History = "0";
	  }
	  
	  /**
	   * Gets the total in calculator
	   */
	  public int getTotal () {
		  return total;
	  }
	  
	  /**
	   * Adds a value to the total
	   * The action performed is stored into the History
	   */
	  public void add (int value) {
		  total = total +value;
		  History += " + " + value;
	  }
  
	  /**
	   * Subtract a value from the total 
	   * The action performed is stored into the History
	   */
	  public void subtract (int value) {
		  total = total - value;
		  History += " - " + value;
	  }
 
	  /**
	   * This method returns the history as a string
	   */
	  public String toString () {
		  return History;
	  }
	  
	  /**
	   * Clears the History
	   */
	  public void clear() {
		  History = "0";
	  }

/**
* A constructor myCaculator is created and acts as a simple calculator.
* Methods add, subtract, clear, and tostring are used to input into the calculator.
* it returns a string of the history of the actions
* and ends by clearing the calculator's history
*/
public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine(); 
		myCalculator.add (4); 
		myCalculator.subtract (2); 
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
		myCalculator.clear();
	}
}