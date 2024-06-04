import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        //int a = 10; Here a is known as an identifier. Identifiers are the names given to classes, variables, methods etc.
        //10 is a literal. Literals are the values assigned to variables.
        //In an integer, we can use _ in between the numbers to make it more readable. It doesn't affect the value of the number.
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;
        System.out.println("The sum of the two numbers is " + sum);
    }
}

