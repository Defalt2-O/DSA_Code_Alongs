import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(45, 87, 65, 47, 21, 96, 35, 48);
        multiple(2, 4, 67, 34, 67);
    }

    static void multiple(int a, int b, int ...v){ /*the variable length argument should be the last argument in the function, 
        because putting it in the middle will make it ambiguous. */
        System.out.println(a*b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
