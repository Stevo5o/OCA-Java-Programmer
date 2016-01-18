# OCA-Java-Programmer

![](http://education.oracle.com/education/ou_rd14/image/oracleuniversity_logo.png)

| Lesson 01      | Lesson 02       | Lesson 03       | Lesson 04           | Lesson 05           |
| :------------  | :------------   | :-------------- | :------------------ | :------------       |
| Packages       | Basic if        | Debugging       | Pass values methods | Encapsulation       |
| Compiling      | Switch, String  | Pass by value   | Q & A  enum         | Immutable           |
| Interpret code | Encapsulation   | Recursion       | Override            | Polymorphism        |
| enum           | Inheritance     | Boolean         | super               | Local variable      |
| for in         | Ploymorphism    | Method overload | static              | Stack Heap          |
| abstract class | Method override | Scope			 |
| JFrame		 |    			   | Arrays		     |
|				 |  			   |Pass Vars Methods|
|				 |				   |Shadowing vars   |
## Basics
"When the compiler's not happy, ain't nobody happy."

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

[Pass values to methods](http://www.dummies.com/how-to/content/how-to-pass-values-to-methods-in-java.html)

[Primitive Vs Reference](http://pages.cs.wisc.edu/~bahls/cs302/PrimitiveVsReference.html)


### Books
[free-programming-books](https://github.com/vhf/free-programming-books/blob/master/free-programming-books.md)

Kathy Sierra, Bert Bates - OCA OCP Java SE 7 Programmer I & II Study Guide