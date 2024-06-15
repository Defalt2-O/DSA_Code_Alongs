public class overloading {
    public static void main(String[] args) {
        /*for overloading to work, either the types should be different, or the number of arguments should be differnet (if the types are same) */
        fun(67); //The function to be called is decided at compile time, not at runtime.
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
