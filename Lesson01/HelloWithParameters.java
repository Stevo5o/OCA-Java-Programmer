class HelloWithParameters
{
	public static void main(String [] args)
	{
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}
/*
java HelloWithParameters 1 2
1
2
// OUTPUT without parameters
thewhitefox@thewhitefox:~/OCA-Java-Programmer/Lesson01$ java HelloWithParameters 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at HelloWithParameters.main(HelloWithParameters.java:5)
thewhitefox@thewhitefox:~/OCA-Java-Programmer/Lesson01$ 
*/