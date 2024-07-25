// methods in JAVA

// creating function in JAVA

/* 
public class methods {

    public static void name(){
        System.out.println("Harshit Dubey");
    }

    public static void main(String[] args) {
        name();
    }
}
*/

//-----------------------------------------------------------------------------------------------------

// syntax with params

/* 
import java.util.*;
public class methods {

    public static void addition(int num1 , int num2){ // num1 & num2 called as PARAMETERS
        int add = num1 + num2 ;
        System.out.println("Addition is "+ add);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Numbers ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        addition(no1, no2);  // no1 & no2 are calles ad ARGUMENTS
        // addition(num1, num2);
    }
}
*/

//-----------------------------------------------------------------------------------------------------

//find the Factorial using functions

/* 
import java.util.*;
public class methods {

    public static void factorial(int n){
        int fact = 1;

        for(int i=1 ; i<=n ; i++){
            fact = fact*i;
        }
        System.out.println("Your Factorial is "+ fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int num = sc.nextInt();
        factorial(num);
    }
}
*/

//-----------------------------------------------------------------------------------------------------

// find binomial coefficient nCr = n! / r!(n-r)! 

/* 
import java.util.*;
public class methods {

    // Function for Factorial
    public static int factorial(int n){
        int fact = 1;

        for(int i=1 ; i<=n ; i++){
            fact = fact*i;
        }
        return fact;
    }

    // Function for Binomial coefficient
    public static int binomial( int n , int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int factNR = factorial(n-r);

        int coefficient = nfact / (rfact * factNR);
        return coefficient;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N ");
        int n = sc.nextInt();

        System.out.print("Enter the R ");
        int r = sc.nextInt();
        

        int ans = binomial(n, r);

        System.out.println("Binomial is "+ans);
    }
}
*/

//-----------------------------------------------------------------------------------------------------

