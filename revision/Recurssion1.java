

// to print the digits from  1 to n
// public class Recurssion1 {
//     public static void numb(int n) {
//         if(n == 0){
//             return ;
//         }
        
//         numb(n - 1);
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         numb(n);
//     }
// }





// to print the digit from n to 1
// public class Recurssion1 {
//     public static void numb(int n) {
//         if(n == 0){
//             return ;
//         }
        
        
//         System.out.println(n);
//         numb(n - 1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         numb(n);
//     }
// }





// to find the factorial
// class factorial{
//     public static int fac(int n ) {
//         if(n == 1 || n == 0){
//             return 1;
//         }
//         int value1 = fac(n-1);
//         int value2 = n * value1;
//         return value2;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         int finalValue = fac(n);
//         System.out.println(finalValue);
//     }
// }





// to find the sum of n number
// class sum{
//     public static int sum1(int n) {
//         if( n == 0){
//             return 0;
//         }
//         return n + sum1(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 6;
        
//         System.out.println(sum1(n));
//     }
// }





// reverse a string
class reverse{
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "";
        char ch;
        for(int i = 0; i<str.length() ; i++){
            ch = str.charAt(i);
            str1 = ch + str1;
        }
        System.out.println(str1);
    }
}