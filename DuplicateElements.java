import java.util.*;
class DuplicateElements {
    static int [] arr={4,5,7,1,10,5,3,4};
    public static void main(String[] args) {int []copy=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
