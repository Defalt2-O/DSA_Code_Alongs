import java.util.Scanner;

public class Demo {
    //first letters of a class should be capital
    //the main (Demo in this case) class should always be public i.e. a public class can be accessed by other files, classes, packages etc
    public static void main(String[] args){ /*we have the main method prefixed with public because it should be accessed by the JVM, and that cannot be done if the method is private
        We use static because the main method is called by the JVM before any objects are created. Usually we call a method using an object. But here, there is no object created yet. So, JVM calls the main method by itself.
        String[] is an array of strings. args is the name of the array. It can be anything. It is used to store command line arguments i.e. after typing java Demo arg1 arg2 arg3, arg1, arg2, arg3 are stored in the args array.
        main method is the entry point of the program */
        System.out.println("Hello World!"); /*System is a class, out is an object of the PrintStream class, println is a method of the PrintStream class. 
        When we say System.out, we are referring to the default output device of the system i.e. the console. println is used to print a line to the console. */
        Scanner input = new Scanner(System.in); /*Scanner is a class, input is an object of the Scanner class, new is a keyword used to create an object, Scanner(System.in) is a constructor of the Scanner class
        System.in reads your inputs from the default input device i.e. the keyboard
        The left side 'Scanner input' is the declaration of the object. The right side 'new Scanner(System.in)' is the instantiation of the object. */
        System.out.println(input.nextLine()); //input is the object of the Scanner class, nextLine is a method of the Scanner class. It is used to read a line of text.
    }
}

//When we type javac in the cmd, it checks the environment variables to find the path of the java compiler. If it finds it, it compiles the file. If it doesn't, it throws an error.
//We add f at the end of a float number because by default, Java treats all floating point numbers as double. So, we add f to tell Java that it is a float number.