class Adder {
	public int addThem(int x, int y) {
		return x + y;
	}
	
	// Overload the addThem method to add doubles instad of ints
	public double addThem(double x, double y) {
		return x + y;
	}
}

// from another class, invoke the addThem() method 
public class TestAdder {
	public static void main(String[] args) {
		Adder a = new Adder();
		int b = 27, c = 3; // int values
		int result = a.addThem(b,c);
		double doubleResult = a.addThem(22.5, 8.3); // double values
		System.out.println("Result: " + result);
		System.out.println("Double Result: " + doubleResult);
	}
}