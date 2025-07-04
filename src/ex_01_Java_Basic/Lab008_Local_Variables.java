package ex_01_Java_Basic;

public class Lab008_Local_Variables {
    //Anything declared/written within the class is the instance variable
    public static void main(String[] args) {
        //Anything declared/written inside the method is a local variable
        int a = 5;
        char y = 'w';
        boolean b = false;
        byte c = 45;
        System.out.println(c);

        //Default value of local variables is never assigned by JVM which means if we just declare any variable without assigning any value to it, an error will be shown

       //int local;
        //System.out.println(local);        // this will throw an error since, the local variable is not assigned a value

        //However, for instance or static variables, even when no value is assigned to a variable, it takes its default value & doesn't throw any error
    }
}
