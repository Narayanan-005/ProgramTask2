import java.util.*;
class Evaluate1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a,b");
        int a=s.nextInt();
        int b=s.nextInt();
        int ex1=++a-b--;
        int ex2=a%b++;
        a*=b+5;
        int x=69>>>2;
        System.out.println("++a-b-->"+ex1);
        System.out.println("a%b++ -->"+ex2);
        System.out.println("a*=b+5 -->"+a);
        System.out.println("69>>>2  -->"+x);
    }
}
