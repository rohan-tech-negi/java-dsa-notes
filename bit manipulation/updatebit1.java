import java.util.*;

// public class getbit1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int pos = sc.nextInt();

        

//         int bitMask = 1 << pos;

//         int operation = bitMask & n;

//         if(operation != 0) {
//             System.out.println(1);

//         }
//         else{
//             System.out.println(0);
//         }
//     }   
// }





// set bit operation
// public class setbit1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int pos = sc.nextInt();

        

//         int bitMask = 1 << pos;

//         int operation = bitMask | n;


//         if(operation != 0) {
//             System.out.println(1);

//         }
//         else{
//             System.out.println(0);
//         }
//     }   
// }






// clear bit operation
// public class setbit1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int pos = sc.nextInt();

        

//         int bitMask = 1 << pos;

//         int notBit = ~(bitMask);
//         int operation1 = notBit & n;



//         if(operation1 != 0) {
//             System.out.println(1);

//         }
//         else{
//             System.out.println(0);
//         }
//     }   
// }






// update bit operation
public class updatebit1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int pos = sc.nextInt();

        

        int bitMask = 1 << pos;
        // for 0 ; clear bit first operation
        int notBit = ~(bitMask);
        int operation1 = notBit & n;


        // for 1; performing or opeartion
        int operation2 = operation1 | n;



        if(operation2 != 0) {
            System.out.println(1);

        }
        else{
            System.out.println(0);
        }
    }   
}