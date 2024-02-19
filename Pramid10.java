import java.util.*;
class Pramid10 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int m=1,l=3;
        for(int i=0;i<4;i++,l--){
            for(int j=0;j<4;j++){
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
