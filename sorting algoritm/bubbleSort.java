import java.util.*;
public class bubbleSort {

    // we write some code for the clean print of the incremented array
    public static void printarrays(int arr[]) {
        for(int i = 0; i<arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {8,7,4,3,1};
        // starting with the outer loop for the iteration of the array
        for(int i =0; i<arr.length-1; i++){
            // inner loop 
            for(int j =0; j<arr.length-i-1; j++){
                // why we write arr.lentht-i-1 as it compares the adjecent element to the i
                // as all the values that are being moves from position 0 to n-1 is being stored in the i

                // we can also say about this line as all the values iterated from the outer loop is being pushed to the inner loop means values from index 0 to 3 is being inside the inner loop as lets say the value of zero for the equation meaning is 5-0-1 and why we take it as that the last element is already sorted so we dont have to go for the last element 
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
            }
            
        }
        printarrays(arr);

    }
}
