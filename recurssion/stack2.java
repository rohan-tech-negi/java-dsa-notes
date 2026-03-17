public class recurssion1{
    public static void printNum(int n) {
        if(n==0){
            return ;
        }
        System.out.println(n);
        printNum(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }
}





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





// print factorial of a number n
public class FactorialNum{
    public static int calcfactorial(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        int fac_n1 = calcfactorial(n-1);
        int fac_n2 = n * fac_n1;
        return fac_n2;
    }
    public static void main(String[] args) {
        int n = 5;
        int value = calcfactorial(n);
        System.out.println(value);
    }
}


// print the fibonacci sequence till nth term
public class fabonaciseqeunce{
    public static void fabonacivalues(int a, int b, int n) {
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        fabonacivalues(b , c, n-1);

    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 7;
        fabonacivalues(a, b, n-2);
    }
}





// print x^n(stack height  = n)
public class stack{
    public static int calcPower(int x , int n) {
        // base condition
        if(n == 0 ){
            return 1;

        }
        if(x == 0){
            return 0;
        }
        int power1 = calcPower(x, n-1);
        int power2 = x * power1;
        return power2;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int values = calcPower(x, n);
        System.out.println(values);
    }
}




public class stack2{
    public static int calcPower(int x , int n) {
        // base condition
        if(n == 0 ){
            return 1;

        } 
        if(x == 0){
            return 0;
        }
        // if n is even
        if(n %2 == 0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        else{
            return calcPower(x, n/2) * calcPower(x, n/2)  * x;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int values = calcPower(x, n);
        System.out.println(values);
    }
}