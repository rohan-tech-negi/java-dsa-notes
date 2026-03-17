    public class checking {
        public static boolean ArrayChecking(int arr[] , int idx){
            if(idx == arr.length-1){
                return true;
            }
            if(arr[idx] < arr[idx + 1]){
                return ArrayChecking(arr, idx+1);
            }
            else{
                return false;
            }
        }
        public static void main(String args[]){
            int arr[] = {1,2,3,4,4};
            System.out.println(ArrayChecking(arr, 0));
            
        }
    }
