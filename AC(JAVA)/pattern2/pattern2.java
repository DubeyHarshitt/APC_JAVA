//Hallow recrangle pattern

/*
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number rows :- ");
        int tlRows = sc.nextInt();
        System.out.print("Enter the Number columns :- ");
        int tlClms = sc.nextInt();

        for(int i=1 ; i<=tlRows ; i++){
            for(int j=1 ; j<=tlClms ; j++){
                if (i==1 || j==1 || i==tlRows || j==tlClms) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }
}
*/
//-----------------------------------------------------------------------------------
//inverted and rotated half pyramid

/* 
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number rows :- ");
        int tlRows = sc.nextInt();
        // System.out.print("Enter the Number columns :- ");
        // int tlClms = sc.nextInt();

        for(int i=1 ; i<=tlRows ; i++){

            //For Spaces
            for(int j=1 ; j<=tlRows-i ; j++){
                System.out.print(" ");
            }

            //For Stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
*/
//-----------------------------------------------------------------------------------
// 12345
// 1234
// 123
// 12
// 1


/* 
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number rows :- ");
        int tlRows = sc.nextInt();
        // System.out.print("Enter the Number columns :- ");
        // int tlClms = sc.nextInt();

        for(int i=0 ; i<=tlRows ; i++){

            //For numbers
            for(int j=1 ; j<=tlRows-i ; j++){
                System.out.print(j);
            }

            //For spaces
            for(int j=1 ; j<=i ; j++){
                System.out.print(".");
            }
            
            System.out.println( );
        }
    }
}
*/

/*
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number rows :- ");
        int tlRows = sc.nextInt();
        // System.out.print("Enter the Number columns :- ");
        // int tlClms = sc.nextInt();

        for(int i=1 ; i<=tlRows ; i++){
            int a=1;
            for(int j=tlRows ; j>=i ; j--){
                System.out.print(a);
                a++;
            }
            System.out.println( );
        }
    }
}
*/

//-----------------------------------------------------------------------------------

//Floyd Triangle
/* 
import java.util.*;

public class pattern2 {

    public static void floydTriangle(int n){
        int var = 1 ;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++ ){
                System.out.print(var + " ");
                var+=1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows ");
        int num = sc.nextInt();
        floydTriangle(num);
    }
}
*/

//-----------------------------------------------------------------------------------

//Floyd Triangle (0-1)
/* 
import java.util.*;

public class pattern2 {

    public static void floydTriangle(int n){

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++ ){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows ");
        int num = sc.nextInt();
        floydTriangle(num);
    }
}
*/
//-----------------------------------------------------------------------------------

/* 
//ButterFly pattern
import java.util.*;

public class pattern2 {

    public static void ButterFly(int n){

        // First Half
        for(int i=1 ; i<=n ; i++){
            // Star
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            // Spaces
            for(int j=1 ; j<=(2*(n-i)) ; j++){
                System.out.print(" ");
            }
            // Star
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second Half
        for(int i=n ; i>=0 ; i--){
            // Star
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            // Space
            for(int j=1 ; j<=(2*(n-i)) ; j++){
                System.out.print(" ");
            }
            // Star
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows ");
        int num = sc.nextInt();
        ButterFly(num);
    }
}
*/

//-----------------------------------------------------------------------------------

// Solid_Rhombus pyramid

/* 
import java.util.*;
public class pattern2 {

    public static void rhombus(int n){
        //Outer loop
        for(int i=1 ; i<=n ; i++){
            // Spaces
            for (int j=1; j<=(n-i) ; j++) {
                System.out.print(" ");
            }
            // Stars-1
            for (int j=1; j<=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows ");
        int num = sc.nextInt();
        rhombus(num);
    }
}
*/

//-----------------------------------------------------------------------------------

/*
//Hollo Rhombus

import java.util.*;
public class pattern2 {

    public static void holloRhombus(int n){
        //Outer loop
        for(int i=1 ; i<=n ; i++){
            // Spaces
            for (int j=1; j<=(n-i) ; j++) {
                System.out.print("  ");
            }
            // Hollow Rectangle-Stars
            for (int j=1; j<=n ; j++) {
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            } 
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows ");
        int num = sc.nextInt();
        holloRhombus(num);
    }
}
 */

//-----------------------------------------------------------------------------------

// Diamond Pattern

import java.util.*;

public class pattern2 {

    public static void ButterFly(int n){

        // First Half
        for(int i=1 ; i<=n ; i++){
            
            //Spaces
            for (int j=0; j<=(n-i) ; j++) {
                System.out.print(" ");
            }

            //Stars 
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Second Half
        for(int i=n ; i>=1 ; i--){

            //Spaces
            for(int j=0 ; j<=(n-i) ; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows ");
        int num = sc.nextInt();
        ButterFly(num);
    }
}

//-----------------------------------------------------------------------------------