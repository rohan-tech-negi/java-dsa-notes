// public class recurssion1{
//     public static void printNum(int n) {
//         if(n==0){
//             return ;
//         }
//         System.out.println(n);
//         printNum(n-1);
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         printNum(n);
//     }
// }





// print the sum of first n natural number
public class naturalNum{
    public static void printNatural(int i, int n, int sum) {
        if (i > n){
            
            System.out.println(sum);
            return;
        }
        sum = i + sum;
        printNatural(i+1, n, sum);
    }
    public static void main(String[] args) {
        printNatural(1, 20, 0);
    }
}