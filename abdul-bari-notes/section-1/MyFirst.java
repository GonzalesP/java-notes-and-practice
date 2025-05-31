import java.lang.*;  // the Java language PACKAGE (similar to C++ libraries)
// contains the System class, but this is usually imported by default

public class MyFirst
{
    // everything in Java is written in the form of a class (nothing is outside of a class)
    public static void main(String args[])
    {
        System.out.println("Hello, world!");  // printing text onto console

        // println() is a method for printing onto a screen
        // it comes from an object called 'out', which comes from the System class

        
        // example of using args[]
        // note: if nothing is given to the command line, there will be an out of bounds error!
        System.out.println(args[0]);

        // e.g. java MyFirst sup: running this command will print Hello, world! then sup
        // in this case, sup is args[0], the first argument
    }

    // like C++, main() is the starting METHOD (not function) of Java classes.
    // its return type is always void

    // public allows things OUTSIDE of the class (e.g., terminal) to access the method
    // making main() public allows the JVM to access it

    // static allows you to use a class's method WITHOUT creating an object of the class
    // making main() static allows the JVM to run it without making an object!

    // String args[] refers to command line arguments. It MUST BE PRESENT, even if unused!
    // That's just how the compiler prefers the main method's signature to be
    // *technically, you can use a different name than args, but you need a String []
}

// good practice: make sure the class name is the same as the file name
// otherwise, the compiler will produce a class with a different name than the file
// e.g. 'javac nameA.java' vs. 'java nameB'

// this is especially bad when using public classes
// the compiler will print an error saying that the public class "nameB" should be declared in a file
// called "nameB.java", not "nameA.java"



// compile: javac MyFirst.java
// creates MyFirst.class, contains BYTE CODE executed by the JRE

// run: java MyFirst
// just the name of the class, no extensions!
// "essentially calls MyFirst.main()"