public class Subsequence{
    public static void subSequence(String str, int idx, String newString, HashSet<String>){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
              System.out.println(newString);
              set.add(newString)
            return;  
            }
            
        }

        char currChar = str.charAt(idx);

        // to be 
        subSequence(str, idx+1, newString+currChar)

        // not to be
         subSequence(str, idx+1, newString)
    }
     public static void main(String args[]){
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        subSequence(str, 0, "");
    }
}