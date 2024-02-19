import java.util.*;
class LeftRotate {
    static int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
    public static void main(String[] args) {
        int temp=0;
           for(int i=0,j=0;i<arr.length;i++){
           temp=arr[i][0];
           for(j=0;j<arr[i].length-1;j++){
               arr[i][j]=arr[i][j+1];
           }
           arr[i][j]=temp;
           System.out.println(Arrays.toString(arr[i]));
       }
    }
}
