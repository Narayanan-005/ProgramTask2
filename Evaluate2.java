import java.util.*;
class Evaluate2 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a");
        int a=s.nextInt();
        a+=(a++)+(++a)+(--a)+(a--);
        System.out.println(a);
    }
}
