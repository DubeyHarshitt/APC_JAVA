// Taking input in Array

// import java.util.Scanner;

// public class Array1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number of Subjects ");
//         int size = sc.nextInt();
//         int marks[] = new int[size];

//         System.out.println("Enter the Marks of Subjects ");
//         //Taking Input in array
//         for(int i=0 ; i<marks.length ; i++){
//             marks[i]= sc.nextInt();
//         }
//         //Displaying Array
//         for(int i=0 ; i<marks.length ; i++){
//             int element = marks[i];
//             System.out.println("The Marks are "  + element);
//         }
//     }
// }

//-------------------------------------------------------------------------------------

//Basics Array
/* 
import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        System.out.println("Enter Marks ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();    
        marks[2] = sc.nextInt();

        System.out.println("Physics Marks " + marks[0]);
        System.out.println("Chemistry Marks " + marks[1]);
        System.out.println("Maths Marks " + marks[2]);

        int percentage = ((marks[0] + marks[1] + marks[2])/3);
        System.out.println("Your Percentage is " + percentage + "%");

    }
}
*/

//-------------------------------------------------------------------------------------

//Arraysc as Functions Arguments
/*
import java.util.Scanner;

public class Array1 {

    public static void updateArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = arr[i]+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array size ");
        int size = sc.nextInt();

        int marksArr[] = new int[size];

        //Taking Input
        for(int i=0 ; i<marksArr.length ; i++){
            marksArr[i] = sc.nextInt();
        }

        updateArr(marksArr);
        
        System.out.println();

        // Displaying Array
        for(int i=0 ; i<marksArr.length ; i++){
            System.out.print(marksArr[i]+ " ");
        }
        System.out.println();
    }
}
 */

//-------------------------------------------------------------------------------------

// Linear Search in Array 
/*
import java.util.* ;

public class Array1 {

    public static int binarySearch(int num[] , int key){
        for(int i=0 ; i<num.length ; i++){
            int val = num[i];
            if(val == key){
                System.out.println("Element is found on Index " + i);
                return 0;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = {4,6,8,10,12,14,16};
        System.out.println(Arrays.toString(array));

        System.out.print("Enter element to be Searched from Array ");
        int key = sc.nextInt();

        int index = binarySearch(array, key);

        if(index == -1){
            System.out.println("Element Not Found ") ;
        }
    }
}
*/

//-------------------------------------------------------------------------------------
/*
// Find Largest number in array 
import java.util.*;
public class Array1 {

    public static int largestInArray(int num[]){
        int maxArray = num[0];
        for(int i=0 ; i<num.length ; i++){
            if(num[i]>maxArray){
                maxArray = num[i];
            } 
        }
        return maxArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int array[] = {4,6,8,10,18,14,16};
        System.out.print("Enter the size of Array ");
        int size = sc.nextInt();

        int array[] = new int[size];
        //Input
        System.out.println("Enter Elements in Array");
        for(int i=0 ; i<array.length ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array)+"\n");

        int max = largestInArray(array);
        System.out.println("Largest Number in Array is "+ max);
    }
}
*/

//-------------------------------------------------------------------------------------

 //Binary Search
/* 
 import java.util.*;

 public class Array1 {

    public static int binarySearch(int num[] ,int key){
        int fcnKey = key;
        int low = 0;
        int high = num.length-1;
        while (low<=high) {

                int mid = (low+high)/2;
            if(num[mid]==fcnKey){
                // System.out.println("Element Found ");
                return mid;
            }
            else if(num[mid]>fcnKey){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            }
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int array[] = {4,6,8,10,18,14,16};
        System.out.print("Enter the size of Array ");
        int size = sc.nextInt();

        int array[] = new int[size];
        //Input
        System.out.println("Enter Sorrted Array");
        for(int i=0 ; i<array.length ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array)+"\n");

        System.out.print("Enter the Element to be Found ");
        int key = sc.nextInt();
        
        int ans = binarySearch(array , key);
        if(ans == -1){
            System.out.println("Element not Found ");
        }
        else{
            System.out.println("Element is Found on Index " + ans);
        }
    }
}
*/

//-------------------------------------------------------------------------------------
/* 
// Reverse an Array
import java.util.*;

public class Array1 {

    public static void reverseNum(int num[]){
        int first=0 , last = num.length-1;

        while(first<last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++ ;
            last-- ;
        }

        System.out.println("After "+Arrays.toString(num)+"\n");
    };

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       // int array[] = {4,6,8,10,18,14,16};
       System.out.print("Enter the size of Array ");
       int size = sc.nextInt();

       int array[] = new int[size];
       //Input
       System.out.println("Enter Sorrted Array");
       for(int i=0 ; i<array.length ; i++){
           array[i] = sc.nextInt();
       }
       System.out.println("Before "+Arrays.toString(array)+"\n");
       
       reverseNum(array);
   }
}
*/

//-------------------------------------------------------------------------------------

/* 
// Pairs in Array

import java.util.*;

public class Array1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // int array[] = {4,6,8,10,18,14,16};
    System.out.print("Enter the size of Array ");
    int size = sc.nextInt();

    int array[] = new int[size];
    //Input
    System.out.println("Enter Sorrted Array");
    for(int i=0 ; i<array.length ; i++){
        array[i] = sc.nextInt();
    }
    System.out.println("Before "+Arrays.toString(array)+"\n");

    //-----------

    // int first=0 , second=1;
    for(int i=0 ; i<array.length ; i++){
        int curr = array[i]; // 2,3,4...
        for(int j=i+1 ; j<array.length ; j++){
            System.out.print("("+curr +"," + array[j]+")");
        }
        System.out.println();
    }
}
}
*/

//-------------------------------------------------------------------------------------

//Printing Sub Arrays  [2,4,6,8,10] --> [2] - [2,4] - [2,4,6] - [2,4,6,8] - [2,4,6,8,10] 
// harr n array me n(n+1)/2 sub arrays hote h

import java.util.*;

public class Array1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int array[] = {2,4,6,8,10};
    int ts=0;

    for(int start=0 ; start<array.length ; start++){
        for(int end=start ; end<array.length ; end++){
            for(int k=start ; k<=end ; k++){
                System.out.print( array[k]);
            }
            ts++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("Total sub Array's is "+ ts);
}
}

//-------------------------------------------------------------------------------------