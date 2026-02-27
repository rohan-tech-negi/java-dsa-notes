

public class bubblesort1{
    public static void printarrays(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {3,5,2,7,9};

        // outer loop for the iteration
        for(int i=0; i<arr.length-1;i++){
            // inner loop 
            for(int j=0; j<arr.length-i-1; j++){
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
