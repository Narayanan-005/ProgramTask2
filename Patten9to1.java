import java.util.*;
class Patten9to1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int m=n;
        for(int i=0;i<n;i++,m--){
            for(int j=0;j<n;j++){
                if( j>=i){
                    System.out.print(m+" ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
