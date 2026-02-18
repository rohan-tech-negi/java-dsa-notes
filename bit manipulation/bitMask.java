
// get bit operation
public class bitMask {
    public static void main(String[] args) {
        int n =5;
        int pos =3;
        int bitMask = 1 << pos;
        if((bitMask & n) == 0){
            System.out.println("bit is not zero");

        }
        else{
            System.out.println("bit is zero");
        }
    }
}





// set bit operation
class setBit{
    public static void main(String[] args) {
        int n =5;
        int pos = 1;
        int bitMask = 1 << pos;
        int newNumber = bitMask | n;
        if(newNumber == 0){
            System.out.println("bit is not zero");
        }
        else{
            System.out.println("bit is zero");
        }
    }
}





// clear bit
class clearBit{
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        if(newNumber == 0){
            System.out.println("bit is not zero");
        }
        else{
            System.out.println("bit is zero");
        }
    }
}