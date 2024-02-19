import java.util.*;
class ReverseNumber {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter number");
        int num=s.nextInt();
        while(num>0){
            System.out.print(num%10);
            num/=10;
        }
    }
}
