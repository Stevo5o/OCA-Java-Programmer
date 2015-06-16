public class Literals {
	public static void main(String[] args) {
		int a = 1;
		int b = 0b10;
		int c = 04;
		int d = 0x4b;
		int e = 100_000;
		int f = 0b_01; // error: illegal underscore
	}
}