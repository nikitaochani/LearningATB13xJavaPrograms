package ex_01_Java_Basic;

public class Lab009_Literals {
    public static void main(String[] args) {
        boolean b = true; //Boolean Literal
        char a = 't'; //Character Literal
        char c = '#'; //Character Literal
        char u = '&'; //Character Literal - Character Literals can be A-Z, a-z, #$%^&@
        String s = "Hello"; //String Literal
        int j = 10; //Integral Literal
        float f = 10.65f; //Floating literal
        double d = 1987.65; // Double Literal
        System.out.println(s);

        //Escape Characters
        // '\t' -> tab space (This will give tab space between 2 characters)
        // '\n' -> new line (This will print the characters on a new line)
        // '\b' -> backspace (This will backspace/remove 1 character)
        // '\r' -> carriage return (This will remove the entire word placed before)

        char tab_space = '\t';
        char new_line = '\n';
        char backspace = '\b';
        char carriage_return = '\r';

        System.out.println("Nikita"+tab_space+"Ochani");
        System.out.println("Nikita"+new_line+"Ochani");
        System.out.println("Nikita"+backspace+"Ochani");
        System.out.println("Nikita"+carriage_return+"Ochani");

    }
}
