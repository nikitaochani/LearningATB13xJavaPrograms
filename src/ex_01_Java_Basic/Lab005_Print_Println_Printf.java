package ex_01_Java_Basic;

public class Lab005_Print_Println_Printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Hello. My Name is Test"); //Println prints the statement in next line
        System.out.println("Hello. You There?");
        System.out.print("Hello");//print prints the statement in the same line & not on the next line
        System.out.printf("Value of a is %d", a);//printf is used to format the output
        System.out.printf("Value of a is %d + %d", a, a);

        // %d can used to format the output if datatype used is int, byte, short, long
        // %s can be used to format the output if datatype used is string
        // %f -> float, double
        // %b -> boolean
    }
}
