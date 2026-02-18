

public class selectionSort {
    public static void printArrys(int arr[]) {
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {8,7,3,4,1};
        // starting with the outer loop for the iteration of the array till n-1
        for(int i = 0; i<arr.length-1; i++){
            int smallest = i;
            // inner loop 
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]> arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArrys(arr);
    }
}
