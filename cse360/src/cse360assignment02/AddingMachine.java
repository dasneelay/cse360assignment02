package cse360assignment02;

public class AddingMachine {
	private int total;
	private String hist="0";

	/**
	 * AddingMachine() method sets total to 0 getTotal() returns total value add()
	 * adds parameter value to total subtract() subtracts parameter value from total
	 * toString() returns history of transactions clear() clears memory
	 */
	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}

	public int getTotal() {
		return total;
	}

	public void add(int value) {
		total += value;
		hist = hist + " + " + value;

	}

	public void subtract(int value) {
		total -= value;
		hist = hist + " - " + value;
	}

	public String toString() {
		return hist;
	}

	public void clear() {
		total = 0;
		hist = "";
	}
}
