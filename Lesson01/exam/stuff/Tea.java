package exam.stuff;

// for this to work Beverage needs to be public or in the same package
// if the Beverage class is public final there will be an compile error
// as you cannot extend a final class
// final class obliterates a key benefit of OO—extensibility
import cert.Beverage;

class Tea extends Beverage
{
	
}

// 1st compile error:
// Beverage is not public in cert; cannot be accessed from outside package
// import cert.Beverage;
// use public class in Beverage to compile

// 2nd compile error:
// error: cannot inherit from final Beverage
// class Tea extends Beverage


