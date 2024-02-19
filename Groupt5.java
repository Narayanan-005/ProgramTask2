import java.util.*;
class Groupt5 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        Groups(n);
        Groups(n+1);
        Groups(n+2);
        Groups(n+3);
    }
    public static void Groups(int n){
        System.out.println("group");
        for(int i=n;i<=120;i+=4){
            System.out.println(i);
        }
    }
}
