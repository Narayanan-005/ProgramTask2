import java.util.*;
class Series1 {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int sum=0,num=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                num=num*10+1;
            }
            sum+=num;
            num=0;
        }
        System.out.println(sum);
    }
}
