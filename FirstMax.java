import java.util.*;
class FirstMax {
    static int []arr={1, 2, 3, 4, 5, 6, 7};
    public static void main(String[] args) {
        int []res=new int[arr.length];
        for(int i=0,j=arr.length-1,k=0;k<res.length;k++){
            if(k%2==0){
                res[k]=arr[j--];
            }else{
                res[k]=arr[i++];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
