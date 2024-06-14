public class shadowing {
    static int x = 90; //this will be shadowed at line 5
    public static void main(String[] args) {
        System.out.println(x); //prints 90 i.e. class variable
        int x = 40; //x now refers to local variable with value 40
        System.out.println(x);// prints 40 i.e. local variable
        fun();// prints 90 i.e. class variable because fun is outside the scope of main, and the x in fun refers to the class variable.
    }

    static void fun(){
        System.out.println(x);
    }
}
