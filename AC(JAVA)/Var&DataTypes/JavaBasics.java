//Boiler plate Code

/*
public class JavaBasics {
    public static void main(String args[]){
         
    }
}
*/

//---------------------------------------------------------------------------------

//Output in Java

/* 
public class JavaBasics {
    public static void main(String args[]){
         System.out.println("Hello world");
    }
}
*/

//---------------------------------------------------------------------------------

//printing stars

/* 
public class JavaBasics{
    public static void main(String args[]){
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}
*/

//---------------------------------------------------------------------------------

// Vriables in java 

/* 
public class JavaBasics{
    public static void main(String args[]){
        int a = 10 ;
        int b = 20 ;
        System.out.println(a);
        System.out.println(b);
        int sum = a + b ;
        System.out.println(sum);
    }
}
*/

//--------------------------------------------------------------------------------- 

//Input in Java
// import java.util.*; , Scanner sc = new Scanner(System.in);

/* 
import java.util.*;

public class JavaBasics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);
        System.out.println("Enter the Name");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Enter the Number");
        int number = sc.nextInt();    //To take input of number sc.nextInt is used
        System.out.println("Your Number is " + number);

        System.out.println("Enter the decimal value");
        float value = sc.nextFloat();
        System.out.println("Your float value " + value);

        System.out.println("Enter the Boolean data");
        boolean x = sc.nextBoolean();
        System.out.println("your value is "+ x);
    }
}
*/

//---------------------------------------------------------------------------------

// sum and multiplication of a&b by taking input from user

/* 
import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        int sum = a+b ;
        System.out.println("Sum of Two Number is " + sum);
        int mul = a*b;
        System.out.println("Multiplication of two Number is " + mul);
    }
}
*/

//---------------------------------------------------------------------------------

// Program to find area of circle (A = 3.14 * r^2)

/* 
import java.util.*;

public class JavaBasics{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.println("To find area of Circle");
        System.out.println("Enter the Radius of Circle");
        float rad = sc.nextFloat();
        float area = 3.14f *(rad*rad);
        System.out.println("The radius of Circle is "+ area);
    }
}
*/

//---------------------------------------------------------------------------------

