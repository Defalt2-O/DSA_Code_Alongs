import java.util.Scanner;
//
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println("The number is " + num);   

        //Type casting
        int num1 = (int)(67.89f); //Typecasting is done by putting the data type in brackets before the value. This is known as explicit type conversion or narrowing type conversion, because we are converting a larger data type to a smaller data type.
        System.out.println(num1); //This will print 67. This is because the decimal part is removed. The value is not rounded off. It is simply removed.

        //Automatic type conversion in expressions
        int a = 257;
        byte b = (byte)(a); //This will print 1. This is because 257 is 1 in binary. 257 is 100000001 in binary. In a byte, only 8 bits are stored. So, the last 8 bits are stored. The last 8 bits are 00000001, which is 1 in decimal.
        System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = (c * d) / e; //This will print 20. This is because the expression is evaluated from left to right. c * d is 2000. 2000 / e is 20. Therefore, the answer is 20.
        System.out.println(f);
        //When performing c * d, java automatically converts c and d to integers. 

        //This is why the following code will NOT work:
        byte x = 5;
        byte y = 10;
        //byte z = x * y; //This will throw an error. This is because when performing x * y, java automatically converts x and y to integers. The result of x * y is an integer. However, an integer cannot be stored in a byte. Therefore, it throws an error.
    //Type conversion can take place if the following conditions are true:
    //1. The two types are compatible i.e. you cannot convert a string to an integer.
    //2. The destination type is larger than the source type i.e. in this case, float is larger than int. In float you can also store decimal values. In int, you cannot. Therefore float is larger than int.
    //Note: If you ask for a small input but provide a large value, i.e. if you ask for an integer input and provide a float value, it will throw an error. This is because the destination type is smaller than the source type.

    //Automatic type conversion takes place, however explicit type conversion is also possible. This is known as typecasting.

    //Type promotion rules (Type promotion is the promotion of data to a larger data type, such as the 2 bytes into int in the above example):
    //1. If two values have different data types, Java will automatically promote one of the values to the larger data type.
    //2. If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value's data type.
    //3. Byte, short, and char values are first promoted to int any time they are used with a Java binary arithmetic operator, even if neither of the operands is int.
    //4. After all promotion has occurred and the operands have the same data type, the resulting value will have the same data type as its promoted operands.

}
}

//Video - 8, Timestamp 1:07:43 - Typecasting and Type Conversion in Java