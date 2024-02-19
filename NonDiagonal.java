import java.util.*;
class NonDiagonal {
    static int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
    public static void main(String[] args) {
        List <List<Integer>> list=new ArrayList();
        for(int i=0,k=0;i<arr.length;i++){
            List<Integer> l=new ArrayList();
            for(int j=i;j>=0 && j<=i;j--,k++){
                l.add(arr[k][j]);
            }
            list.add(l);
            k=0;
        }
        
        for(int i=1;i<arr.length;i++){
            int k=arr.length-1;
            List<Integer> l=new ArrayList();
            for(int j=i;j<arr.length;j++,k--){
                l.add(arr[j][k]);
            }
            list.add(l);
        }
        System.out.println(list);
    }
}
