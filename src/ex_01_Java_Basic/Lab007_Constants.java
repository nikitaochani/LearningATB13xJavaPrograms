package ex_01_Java_Basic;

public class Lab007_Constants {
    public static void main(String[] args) {
        int a = 11;
        a = 17;
        System.out.println(a); // When no "final" keyword is used, we can re-assign the value of the variable

        final int b = 76; // As soon as final keyword is used, this is the constant value of b & cannot be changed
        //b = 89; //Hence, this error
        System.out.println(b);
    }
}
