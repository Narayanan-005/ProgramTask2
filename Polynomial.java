import java.util.*;
class Polynomial {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ax2+bx+c=0----->enter a,b,c");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        double x1=(-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        double x2=(-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        System.out.println("x1="+x1);
        System.out.println("x2="+x2);
    }
}
