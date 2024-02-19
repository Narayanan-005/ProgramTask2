import java.util.*;
class PrintX {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
       String st=s.nextLine();
       for(int i=0;i<st.length();i++){
           for(int j=0;j<st.length();j++){
               if(i+j==st.length()-1 || i==j)
               System.out.print(st.charAt(j)+" ");
               else
                System.out.print("  ");
           }
           System.out.println();
       }
    }
}
