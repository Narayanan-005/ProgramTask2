import java.util.*;
class A1B10 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        String str=s.next()+" ",res="";
        char ch=' ';
        int n=0;
        for(int i=0;i<str.length()-1;i++){
            if(Character.isLetter(str.charAt(i))){
                ch=str.charAt(i);
            }else{
                while(Character.isDigit(str.charAt(i))){
                    n=n*10+(str.charAt(i++)-48);
                }
                i--;
            }
            if(ch!=' ' && n!=0){
                res+=repetion(ch,n);
                n=0;
            }
        }
        System.out.println(res);
    }
    public static String repetion(char c,int n){
        String res="";
        for(int i=0;i<n;i++){
            res+=c;
        }
        return res;
    }
}
