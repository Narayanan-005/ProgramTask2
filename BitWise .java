import java.util.*;
class BitWise {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int m=s.nextInt();
        System.out.println(n&m);
        System.out.println(n|m);
        System.out.println(~m);
        System.out.println(n^m);
        System.out.println(n>>m);
        System.out.println(n<<m);
        System.out.println(n>>>m);
    }
}
