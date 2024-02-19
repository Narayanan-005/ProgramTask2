import java.util.*;
class OddDecending {
    static int []arr={13,2,4,15,12,10,5};
    public static void main(String[] args) {
       for(int i=0;i<arr.length;i+=2){
           for(int j=i+2;j<arr.length;j+=2){
               if(arr[i]<arr[j]){
                   int temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
               }
           }
       }
       for(int i=1;i<arr.length;i+=2){
           for(int j=i+2;j<arr.length;j+=2){
               if(arr[i]>arr[j]){
                   int temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
               }
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
