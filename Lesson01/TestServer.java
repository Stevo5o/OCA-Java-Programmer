// count variable is shadowed - declare a local variable 
// with the same name as an instance variable
class TestServer {
	int count = 9; // declare an instance variable named count
	public void logIn() {
		int count = 10; // declare a local variable named count
		System.out.println("Local variable count is " + count);
	}
	public void count() {
		System.out.println("Instance variable count is " + count);
	}
	public static void main(String[] args) {
		new TestServer().logIn();
		new TestServer().count();
	}
} 