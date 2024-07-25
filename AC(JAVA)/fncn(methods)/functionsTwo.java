// FUNCTION OVERLOADING

//Function overloading using parametrs
/* 
public class functionsTwo {

    public static int sum(int a ,int b){
        return a+b;
    }

    public static int sum(int a ,int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));
    }
}
*/

//-----------------------------------------------------------------------------------------------------

//Function overloading using Data types

/* 
public class functionsTwo {

    public static int sum(int a ,int b){
        return a+b;
    }

    public static float sum(float a ,float b){
        return a+b ;
    }
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2.5f, 3.5f));
    }
}
*/

//-----------------------------------------------------------------------------------------------------

//to check the number is prime or not 
/* 
import java.util.*;

public class functionsTwo {

    public static boolean isPrime(int n){
        boolean isPrime = true;

        for(int i=2 ; i<=n-1 ; i++){
            if (n%i ==0 ) {
                isPrime = false; 
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = sc.nextInt();
        boolean res = isPrime(number);
        System.out.println(res);
    }
}
*/

//-----------------------------------------------------------------------------------------------------

//Print all primes in a Range

/* 
import java.util.*;

public class functionsTwo {

    public static boolean isPrime(int n){
        boolean isPrime = true;

        for(int i=2 ; i<=n-1 ; i++){
            if (n%i ==0 ) {
                isPrime = false; 
            }
        }
        return isPrime;
    }

    public static void primes(int n){
        for(int i=2 ; i <= n ; i++){
            if (isPrime(i)) {
                System.out.println(i+ " is the Prime Number");
            }
            // else{
                // System.out.println("The Number is Not Prime  "+ i);
            // }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int num = sc.nextInt();
        primes(num);
    }
}
*/

//-----------------------------------------------------------------------------------------------------
//Convert Binary to Decimal && Decimal to Binary

/* 
import java.util.*;

public class functionsTwo {

    public static void binToDec(int binNo , int no){
        int pow = 0;
        int decimal = 0;
        while (binNo > 0) {
            int lastDigit = binNo % 10 ;
            decimal = decimal+(lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNo = binNo/10;
        }
        System.out.println("The Decimal value of " + no +" is " + decimal);
    }


    public static void DecToBin(int decNo , int no){
        
        int pow = 0;
        int binaryNo = 0;

        while (decNo > 0) {
            int rem = decNo % 2;
            binaryNo = binaryNo + (int)(rem * Math.pow(10, pow));
            pow++;
            decNo/= 2;
        }
        System.out.println("The Binary value is " + binaryNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Binary Number ");
        // int num = sc.nextInt();
        // binToDec(num , num);

        System.out.print("Enter the Decimal Number ");
        int dec = sc.nextInt();
        DecToBin(dec , dec);

    }
}
*/