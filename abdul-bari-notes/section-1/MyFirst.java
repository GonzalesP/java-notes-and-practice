import java.lang.*;  // the Java language PACKAGE (similar to C++ libraries)

// good practice: make sure the class name is the same as the file name
class MyFirst
{
    // everything in Java is written in the form of a class (nothing is outside of a class)
    public static void main(String args[])
    {
        System.out.println("Hello, world!");  // printing text onto console

        // println() is a method for printing onto a screen
        // it comes from an object called 'out', which comes from the System class
    }

    // like C++, main() is the starting METHOD (not function) of Java classes.
    // its return type is always void

    // public allows things OUTSIDE of the class (e.g., terminal) to access the method
    // making main() public allows the JVM to access it

    // static allows you to use a class's method WITHOUT creating an object of the class
    // making main() static allows the JVM to run it without making an object!

    // String args[] refers to command line arguments. It must be present, even if unused!
}

// compile: javac MyFirst.java
// creates MyFirst.class, contains BYTE CODE executed by the JRE

// run: java MyFirst
// just the name of the class, no extensions!
// "essentially calls MyFirst.main()"