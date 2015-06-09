// count variable is shadowed - declare a local variable 
// with the same name as an instance variable
class TestServer {
	int count = 9; // declare an instance variable named count
	int size = 27;
	public void logIn() {
		int count = 10; // declare a local variable named count
		System.out.println("Local variable count is " + count);
		System.out.println(size);
		setSize(28);
		AppleVariety appleVariety = new AppleVariety();
		appleVariety.color = AppleVariety.AppleColor.RED;
		System.out.println(appleVariety.color);
	}
	public void count() {
		System.out.println("Instance variable count is " + count);
	}
	public static void main(String[] args) {
		new TestServer().logIn();
		new TestServer().count();
	}
	public void setSize(int size) {
		this.size = size; // current object instance variable
		System.out.println(size); // the size on th right is the current value
	}
}

class AppleVariety {
	enum AppleColor { RED, GREEN, YELLOW };
	AppleColor color;
}


