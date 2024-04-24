import java.util.*;

public class FrequencyDecend {
    public static void main(String[] args) {
        int input[]={4,1,2,3,1,2,5,2};
        int optput[]=new FrequencyDecend().decend(input);
        System.out.println(Arrays.toString(optput));
    }
    public int[] decend(int arr[]){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int temp[][]=new int[map.size()][2];
        int i=0;
        for(Map.Entry<Integer,Integer> o:map.entrySet()){
            temp[i][0]=o.getKey();
            temp[i][1]=o.getValue();
            i++;
        }
        Arrays.sort(temp,(a1,b1)->b1[1]-a1[1]);
        i=0;
        for(int k=0;i<temp.length;i++){
            int j=0;
            while (j<temp[i][1]){
                arr[k]=temp[i][0];
                j++;
                k++;
            }
        }
        return arr;
    }
}
