// Nested Loops

//-----------------------------------------------------------------------------------------------

// printing strar patterns using nested loops
//*
//** 
//***    

/* 
import java.util.*;
public class nestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to be printed :- ");
        int num = sc.nextInt();

        for(int row = 0 ; row<=num ; row++){
            for(int clm = 0 ; clm<=row ; clm++){
                System.out.print("*");
            }
             System.out.print("\n");
        }
    }
}
*/

//-----------------------------------------------------------------------------------------------

// inverted star pattern

/* 
import java.util.*;
public class nestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to be printed :- ");
        int num = sc.nextInt();

        for(int row = 1 ; row<=num ; row++){
            for(int clm = num ; clm>=row ; clm--){
                System.out.print('*');
            }
             System.out.print("\n");
        }
    }
}
*/

//-----------------------------------------------------------------------------------------------

//printig number in clm 1,12,123

/* 
import java.util.*;
public class nestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to be printed :- ");
        int num = sc.nextInt();
        char ch = 'A';
        for(int row = 1 ; row<=num ; row++){
            for(int clm = 1 ; clm<=row ; clm++){
                System.out.print(ch);
                ch++;
            }
             System.out.print("\n");
        }
    }
}
*/

//-----------------------------------------------------------------------------------------------

