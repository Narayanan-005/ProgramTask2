import java.util.*;
class PattenStar_ {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int m=0;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n;j++){
                if(i==0 || i==2*n-2){
                    System.out.print("*");
                }else if(j>=n-m && j<=n+m-1){
                    System.out.print("_");
                }else {
                    System.out.print("*");
                }
            }
            if(i<n-1){
               m++; 
            }else {
                m--;
            }
            
            System.out.println();
        }
    }
}
