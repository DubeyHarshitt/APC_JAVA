// Loops in java 


// print hello world 100 times using (While loop)
/* 
public class loops {
    public static void main(String args[]){
        int i = 1 ;
        while(i<=10){
            System.out.println("Harshit Dubey "+i);
            i++;
        }
    }
}
*/

//----------------------------------------------------------------------------------------------

// print 1 to n while taking user input (For Loop)

/* 
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int a = sc.nextInt();
        for( int counter = 1 ; counter <= a ; counter++){
            System.out.print(counter);
        } 
    }
}
*/

//----------------------------------------------------------------------------------------------

// Print sum of n natural numbers 

/* 
import java.util.*;
public class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers ");
        int number = sc.nextInt();
        int sum = 0, i=1;
        while(i<=number){
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
*/

//----------------------------------------------------------------------------------------------

//Print square pattern (For loop)

/* 
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of stars to be print ");
        int number = sc.nextInt();

        for(int row = 0; row<number ; row++){
            for(int colm = 0 ; colm<number ; colm++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
*/

//----------------------------------------------------------------------------------------------

// revese a number using loops

/* 
import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int number = sc.nextInt();

        int revNum = 0;
        int remainder ;

        for(; number!=0 ;){
            remainder = number%10;
            revNum = remainder;
            number/=10;
        System.out.print(revNum);
        }
        

        // while (number>0) {
        //     remainder = number %10;
        //     number /= 10;
        //     revNum = remainder;
        //     System.out.print(revNum);
        // }
    }
}
*/

//----------------------------------------------------------------------------------------------

//keep entering a number till user enter the number in multiple of 10 (BREAK)

/* 
import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        do {
            System.out.print("Enter the Number ");
            int num = sc.nextInt();

            if (num %10 == 0) {
                break;
            }
            else{
                System.out.println("Entered Number is "+num);
                
            }
        } while (true);
    }
}
*/

/*
import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        for(int i = 0 ; true ;  ){
            System.out.print("Enter the Number ");
            int num = sc.nextInt();

            if (num %10 == 0) {
                break;
            }
            else{
                System.out.println("Entered Number is "+num);
            }
        }
    }
}
 */

//----------------------------------------------------------------------------------------------

//display all number except number multiple of 10 (CONTINUE)

/* 
import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        do {
            System.out.print("Enter the Number ");
            int num = sc.nextInt();

            if (num %10 == 0) {
                continue;
            }
            else{
                System.out.println("Entered Number is "+num);
                
            }
        } while (true);
    }
}
*/


//----------------------------------------------------------------------------------------------