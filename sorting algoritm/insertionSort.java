

public class insertionSort {
    public static void printarrays(int arr[]) {
        for(int i = 0; i<arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {3, 4,8 ,9,10};
        for (int i=0; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printarrays(arr);
    }
}
