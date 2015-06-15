public class MyException extends Exception { }

public class NestedTry {
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch(Exception e) {
			try {
				throw new MyException();
			} catch(MyException me) {
				System.out.println("Hello World!");
			}
		}
	}
}