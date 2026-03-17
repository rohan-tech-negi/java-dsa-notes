public class TowerHanoi{
    public static void towerOfHanoi(int n, String src, String dest, String helper){
        if(n==1){
            System.out.println("transfer disk" + n + "from" + src + "to" + dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk" + n + "from" + src + "to" + dest);
        towerOfHanoi(n-1, helper, dest, src);
    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "A", "C", "B");
    }
}