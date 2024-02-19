import java.util.*;
class StringReverse {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(reverse(s.nextLine()));
    }
    public static String reverse(String str){
        int i=str.lastIndexOf(" ");
        if(i==-1){
            return str;
        }else{
            return str.substring(i+1)+" "+reverse(str.substring(0,i));
        }
    }
}
