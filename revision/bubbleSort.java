import java.util.*;

public class bubbleSort {
    public static void printarrys(int arr[]) {
        for(int i=0; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,8,2,9,1};

        // starting with the outer loop
        for(int i=0; i<arr.length-1; i++){
            // than move to the inner loop
            for(int j=0; j<arr.length - i -1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            printarrys(arr);
           
        }
        
    }
}
