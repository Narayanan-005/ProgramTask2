import java.util.*;
class CopyArray {
    static int [] arr={4,5,7,1,10};
    public static void main(String[] args) {
        int []copy=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]=arr[i];
        }
        System.out.println(Arrays.toString(copy));
    }
}
