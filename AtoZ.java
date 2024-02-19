import java.util.*;
class AtoZ {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        char ch=s.next().charAt(0);
        for(;ch<91;ch++){
            System.out.print(ch);
        }
    }
}
