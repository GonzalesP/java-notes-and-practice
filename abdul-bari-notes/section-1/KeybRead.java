import java.lang.*;
import java.util.*;  // the util package (v5+) provides the Scanner class

// the Scanner class obtains user input (like std::cin in C++)
public class KeybRead
{
    public static void main(String args[])
    {
        // Create a new Scanner object that scans System.in (acts like a pipe)
        // System.in is the input object for the System class (i.e., keyboard)
        Scanner s = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter two numbers: ");
        a = s.nextInt(); // store the first number (integer) in int a
        b = s.nextInt();
        c = a + b;

        System.out.println("The sum is " + c);  // + for concatenation
        s.nextLine();



        String name;
        System.out.println("Please enter your name: ");
        name = s.nextLine();
        // note, nextInt() doesn't consume the newline character (\n)
        // which means that calling nextLine() right after will leave you with an empty input (just \n)
        // one workaround is calling an extra nextLine() method;

        System.out.println("Hello, " + name + ".");



        System.out.println("Enter a number in binary, and it will be printed in decimal: ");
        s.useRadix(2);  // the next int is expected to be in base 2 (binary)
        int x = s.nextInt();  // the keyboard input here MUST be in binary (e.g. 1010)

        System.out.println(x);  // the output will be printed in decimal (default)

        s.close();
    }

    // improper input formats will cause a java.util.InputMismatchException!
}

/*
class Scanner methods

nextInt()
nextFloat()
nextDouble()
next()  // string, set of characters (one word)
nextLine()  // sentence, line (multiple words)
nextByte()
nextShort()
nextLong()
nextBoolean()

hasNextInt()  // determine if the next input is an integer (returns true or false)
hasNextFloat()

useRadix()  // set a number base for your next input

*/