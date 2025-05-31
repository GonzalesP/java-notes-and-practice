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



        String name;
        System.out.println("Please enter your name: ");
        name = s.nextLine();

        System.out.println("Hello, " + name + ".");
    }
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

*/