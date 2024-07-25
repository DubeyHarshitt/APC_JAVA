// Conditional Statements in JAVA

//If-Else statements

/* 
import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("The Person is Adult , can Drive , can vote ");
        }
        else if(age<= 17 && age>=13){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Person is Underage");
        }
    }
}
*/

//------------------------------------------------------------------------------------------------

//Print if the Number is Odd or Even
/* 
import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("The number is Even :- "+ num);
        }
        else{
            System.out.println("The number is odd :- "+ num);
        }
    }
}
*/

//------------------------------------------------------------------------------------------------

// Income tax caculator

/* 
import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax , sal;
        System.out.println("Enter the Salary");
        int salary = sc.nextInt();

        if(salary<500000){
            System.out.println("There will be no tax on Salary:- ");
            System.out.println("Your Final salary will be :- "+ salary);
        }
        else if (salary > 500000 && salary <= 1000000) {
            System.out.println("There will be 20% tax on salary");
            tax = (int) (0.20 * salary);
            System.out.println("Tax amount: " + tax);
            sal = salary-tax;
            System.out.println("Your Final salary will be :- "+ sal);
        }
        else{
            System.out.println("There will be 30% tax on salary  ");
            tax = (int) (0.3*salary);
            System.out.println("Tax amount: " + tax);
            sal = salary-tax;
            System.out.println("Your Final salary will be :- "+ sal);
        }
    }
}
*/

//------------------------------------------------------------------------------------------------

// Ternary operator

/* 
import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        String res = age>=18 ? "Person can Drive" : "Person cannot Drive";
        System.out.println(res);
    }
}
*/

/* 
// check student will pass or fail
import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int marks = sc.nextInt();
        String res = marks>35 ? (marks>35 && marks< 60) ? "Person scored 2nd class" : "Person Scored 1st Class"   : "Person is Fail";
        System.out.println(res);
    }
}
*/

//------------------------------------------------------------------------------------------------

//Switch case

/* 
import java.util.*;
public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Samosa , 2: MangoShake , 3: Burger , 4: Pizza ");
        System.out.println("Enter the Order Number");
        int number = sc.nextInt();
        
        switch(number){
            case 1 : System.out.println("Your Samosa have been orderd"); break;
            case 2 : System.out.println("Your MangoShake have been ordered"); break;
            case 3 : System.out.println("Your Burger have been orderd"); break;
            case 4 : System.out.println("Your Pizza have been ordered"); break;
            default : System.out.println("Enter valid Number");
        }
    }
}
*/