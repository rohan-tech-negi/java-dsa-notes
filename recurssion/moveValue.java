public class moveValue {
    public static void MoveAllX(String str, int idx, int count, String StoreString){
        if(idx == str.length()){
            for(int i=0; i<count ; i++){
                StoreString += 'x';
            }
            System.out.println(StoreString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            MoveAllX(str, idx+1, count, StoreString);
        }
        else{
            StoreString +=currChar;
            MoveAllX(str, idx+1, count, StoreString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        MoveAllX(str, 0, 0, "");
    }
}

// code time complexity is : O(n)