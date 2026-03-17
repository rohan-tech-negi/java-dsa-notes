public class ReverseAString{
    public static void ReverseString(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        ReverseAString(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "rohan";
        ReverseAString(str, str.length()-1);
    }
}