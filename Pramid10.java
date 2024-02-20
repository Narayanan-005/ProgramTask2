import java.util.*;
class Pramid10 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int row=0,sum=0;
        for(row=1;sum<=n;row++){
            sum+=row;
        }
        row-=2;
        int m=1,l=row-1;
        for(int i=0;i<row;i++,l--){
            for(int j=0;j<row;j++){
                if( j>=l){
                    System.out.print((m++)+" ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
