import java.util.*;
class Patten1to2 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int m=0,num=1;
        for(int i=0;i<n;i++,m++){
            for(int j=0;j<2*n-1;j++){
                if(j>=n-1-m && j<=n-1+m){
                    System.out.print(num+" ");
                }else {
                    System.out.print("  ");
                }if(j>=n-1-m && j<=n-1+m && j>=n-1){
                    num--;
                }else if(j>=n-1-m && j<=n-1+m){
                    num++;
                }
            }
            num=1;
            System.out.println();
        }
    }
}
