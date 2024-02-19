import java.util.*;
class SubString {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        String str=s.next();
        String sub=s.next();
        System.out.println(subString(str,sub));
    }
    public static int subString(String str,String sub){
        for(int i=0,j=0;i<str.length();i++){
            if(str.charAt(i)==sub.charAt(j)){
                while(i<str.length() && j<sub.length() && str.charAt(i)==sub.charAt(j)){
                    i++;
                    j++;
                }
                if(j==sub.length()){
                    return i-j;
                }
                break;
            }
        }
        return -1;
    }
}
