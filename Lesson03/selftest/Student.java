class Student 
{	
	private double marks1, marks2, marks3;
	private double maxMarks = 100;
	
	public double getAverage()
	{
		double avg = 0;
		avg = ((marks1 + marks2 + marks3) / (maxMarks * 3)) * 100;
		return avg;
	}
	
	public void setAverage()
	{
		avg = val;
	}	
}
/*
thewhitefox@thewhitefox:~/OCA-Java-Programmer/Lesson03/selftest$ javac Student.java
Student.java:15: error: cannot find symbol
		avg = val;
		^
  symbol:   variable avg
  location: class Student
Student.java:15: error: cannot find symbol
		avg = val;
		      ^
  symbol:   variable val
  location: class Student
2 errors
*/