import java.util.List;
import java.util.ArrayList;

public class AntiDiagonal {
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        List<List<Integer>> l=new ArrayList();
        for(int j=0;j<arr[0].length;j++){
            int k=j;
            List<Integer> c=new ArrayList<>();
            for(int i=0;i<j+1;i++,k--){
                c.add(arr[i][k]);
            }
            l.add(c);

        }
        for(int j=1;j<arr[0].length;j++){
            int k=j;
            List<Integer> c=new ArrayList<>();
            for(int i=arr[0].length-1;i>=j;i--,k++){
                c.add(arr[k][i]);
            }
            l.add(c);

        }
        System.out.println(l);
    }
}
