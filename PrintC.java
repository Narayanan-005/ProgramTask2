import java.util.*;
class PrintC {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        rec(n);
        int i=0;
        while(i<n-2){
            System.out.println("*");
            i++;
        }
        rec(n);
    }
    public static void rec(int n){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
