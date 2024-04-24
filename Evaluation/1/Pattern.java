import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        char start='A';
        int nOfIteration=(ch-64)+(ch-64-1),gapPre=(ch-64-1),gapPost=-1;
        for(int i=0;i<nOfIteration;i++){
            if(i==0 || i==nOfIteration-1){
                System.out.println(" ".repeat(gapPre)+start);
            }else{
                System.out.println(" ".repeat(gapPre)+start+" ".repeat(gapPost)+start);
            }
            if(i>=(ch-64-1)){
                start--;
                gapPre++;
                gapPost-=2;
            }else {
                start++;
                gapPre--;
                gapPost+=2;
            }
        }
    }
}
