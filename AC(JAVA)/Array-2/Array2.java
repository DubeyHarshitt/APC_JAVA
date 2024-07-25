// max subarray sum (Brute force)
/* 
public class Array2 {
    public static void main(String[] args) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

         int array[] = {1,-2,6,-1,3};
        // int array[] = {2,4,6,8,10};

         for(int i=0 ; i<array.length ; i++){
            int start = i ;
            for(int j=i ; j<array.length ; j++){
                int end = j;
                for(int k=start ; k<=end ; k++){
                    // System.out.print(" " + array[k]);
                    // Sub array sum 
                    currSum += array[k];
                }
                    System.out.println("cursum "+currSum);
                    if(currSum > maxSum){
                        maxSum = currSum;
                    }
                    currSum=0;
            }
         }
         System.out.println("Max sum = " + maxSum);
    }
}
*/

//-----------------------------------------------------------------------------

// max subarray sum (Prefix Sum)
public class Array2 {
    public static void main(String[] args) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

         int array[] = {1,-2,6,-1,3};
        // int array[] = {2,4,6,8,10};

         for(int i=0 ; i<array.length ; i++){
            int start = i ;
            for(int j=i ; j<array.length ; j++){
                int end = j;
                for(int k=start ; k<=end ; k++){
                    // System.out.print(" " + array[k]);
                    // Sub array sum 
                    currSum += array[k];
                }
                    System.out.println("cursum "+currSum);
                    if(currSum > maxSum){
                        maxSum = currSum;
                    }
                    currSum=0;
            }
         }
         System.out.println("Max sum = " + maxSum);
    }
}