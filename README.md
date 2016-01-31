# OCA-Java-Programmer

![](http://education.oracle.com/education/ou_rd14/image/oracleuniversity_logo.png)

| Lesson 01      | Lesson 02       | Lesson 03       | Lesson 04           | Lesson 05           | Lesson06
| :------------  | :------------   | :-------------- | :------------------ | :------------       | :------------------------ |
| Packages       | Basic if        | Debugging       | Pass values methods | Encapsulation       | Flow Control & Exceptions |
| Compiling      | Switch, String  | Pass by value   | Q & A  enum String  | Immutable           |
| Interpret code | Encapsulation   | Recursion       | Override            | Polymorphism        |
| enum           | Inheritance     | Boolean         | super               | Local variable      |
| for in         | Ploymorphism    | Method overload | static              | Stack Heap          |
| Abstract class | Method override | Scope			 |
| JFrame		 | ArrayList	   | Arrays		     |
| import static	 | TreeSet		   |Pass Vars Methods|
| Interface		 |				   |Shadowing vars   |
| Public 		 |				   |Garbage Collection|
| Protected		 |				   |Self Test        |
| Private		 |				   |

## Basics
"When the compiler's not happy, ain't nobody happy."

![](http://java5tutor.info/images/classsyntax.jpg)



- Class:
A template that describes the kinds of state and behavior that objects
of its type support.
- Object:
At runtime, when the Java Virtual Machine (JVM) encounters the
new keyword, it will use the appropriate class to make an object that is an
instance of that class. That object will have its own state and access to all of
the behaviors defined by its class.
- State: (instance variables)
Each object (instance of a class) will have its
own unique set of instance variables as defined in the class. Collectively, the
values assigned to an object's instance variables make up the object's state.
- Behavior: (methods)
When a programmer creates a class, she creates
methods for that class. Methods are where the class's logic is stored and
where the real work gets done. They are where algorithms get executed and
data gets manipulated.
"A method signature is a collection of information about the method, as in a C prototype or a forward function declaration in other languages. It includes the method's name, type, and visibility, as well as its arguments and return type."

Complete List of Java Keywords (assert added in 1.4, enum added in 1.5)

|   |   |   |   |   |   |
|---|---|---|---|---|---|
| abstract | boolean | break | byte | case | catch |
| char | class | const | continue | default | do |
| double | else | extends | final | finally | float |
| for | goto | if | implements | import | instanceof |
| int | interface | long | native | new | package |
| private | protected | public | return | short | static |
| strictfp | super | switch | synchronized | this | throw |
| throws | transient | try | void | volatile | while |
| assert | enum

Rules associated with declaring classes, import statements, and package statements in a source file:
- There can be only one public class per source code file.
- Comments can appear at the beginning or end of any line in the source code
file; they are independent of any of the positioning rules discussed here.
- If there is a public class in a file, the name of the file must match the name
of the public class. For example, a class declared as public class Dog { }
must be in a source code file named Dog.java .
- If the class is part of a package, the package statement must be the first line
in the source code file, before any import statements that may be present.
- If there are import statements, they must go between the package statement
(if there is one) and the class declaration. If there isn't a package statement,
then the import statement(s) must be the first line(s) in the source code file.

If there are no package or import statements, the class declaration must be
the first line in the source code file.
- import and package statements apply to all classes within a source code file.
In other words, there's no way to declare multiple classes in a file and have
them in different packages or use different imports.
- A file can have more than one nonpublic class.
- Files with no public classes can have a name that does not match any of the
classes in the file.

The following are all legal declarations for the "special" main() :
static public void main(String[] args)

public static void main(String... x)

static public void main(String bang_a_gong[])

main() can be overloaded.

Rules for using static imports:
- You must say import static ; you can't say static import .
- Watch out for ambiguously named static members. For instance, if you do a
static import for both the Integer class and the Long class, referring to MAX_
VALUE will cause a compiler error, since both Integer and Long have a MAX_
VALUE constant, and Java won't know which MAX_VALUE you're referring to.
- You can do a static import on static object references

Class Access?
1. Create an instance of class B.
2. Extend class B (in other words, become a subclass of class B).
3. Access certain methods and variables within class B, depending on the access
control of those methods and variables.

You need to understand two different access issues:
- Whether method code in one class can access a member of another class
- Whether a subclass can inherit a member of its superclass

Three ways to access a method:
- D Invoking a method declared in the same class
- R Invoking a method using a reference of the class
- I Invoking an inherited method

The first concrete subclass of an abstract class must implement all abstract
methods of the superclass.

nonaccess modifiers:
- abstract OCA
- static OCA
- final OCA
- synchronized
- native
- strictfp
- transient
- volatile

[Flashcards](http://www.cram.com/user/ConchubhairtheWhiteFox)

[Controlling Access to Members of a Class](http://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

| Modifier    | Class | Package | Subclass | World
| :-----------|:------|:--------|:---------|:------ |
| public      |  y    |    y    |    y     |   y    |
| protected   |  y    |    y    |    y     |   n    |
| no modifier |  y    |    y    |    n     |   n    |
| private     |  y    |    n    |    n     |   n    |

y: accessible
n: not accessible

For the purposes of discussing the scope of variables, we can say that there are four
basic scopes:
- Static variables have the longest scope; they are created when the class is
loaded, and they survive as long as the class stays loaded in the Java Virtual
Machine (JVM).
- Instance variables are the next most long-lived; they are created when a new
instance is created, and they live until the instance is removed.
- Local variables are next; they live as long as their method remains on the stack.
	- Local variables can be alive and still be "out of scope."
	- Local variables are sometimes called stack, temporary, automatic, or method variables
- Block variables live only as long as the code block is executing.

Default Values for Primitives and Reference Types

| Variable Type  | Default Value |
|:---------------|:------------- |
| Object reference | null (not referencing any object) |
| byte , short , int , long | 0 |
| float , double | 0.0 |
| boolean | false |
| char | '\u0000'

## Resources

## Linux
[Gnome Terminator](http://gnometerminator.blogspot.ie/p/introduction.html)

[Light Table](http://lighttable.com/)

Install JDK
- sudo apt-get update
- java -version
- sudo apt-get install default-jdk

## Windows
[PowerShell](https://msdn.microsoft.com/en-us/mt173057.aspx)

[VSCode](https://code.visualstudio.com/)

## On-line
[ecollege](http://www.ecollege.ie/moodle/course/info.php?id=55)

[Java docs](http://docs.oracle.com/javase/8/)

[JavaRanch](http://www.javaranch.com/)

[Main method](http://www.dickbaldwin.com/java/Java014.htm)

[Why Main method](http://java67.blogspot.ie/2012/08/what-is-main-method-in-java-why-main-is.html)

[Pass values to methods](http://www.dummies.com/how-to/content/how-to-pass-values-to-methods-in-java.html)

[Primitive Vs Reference](http://pages.cs.wisc.edu/~bahls/cs302/PrimitiveVsReference.html)

### Books
Kathy Sierra, Bert Bates - OCA OCP Java SE 7 Programmer I & II Study Guide

Mala Gupta - OCA Java SE 7 Programmer I Certification Guide Prepare for the 1Z0-803 exam

[free-programming-books](https://github.com/vhf/free-programming-books/blob/master/free-programming-books.md)
