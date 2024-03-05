import java.util.Arrays;

public class UniqueElement {

    public static void main(String[] args) {
        int [] arr={3,3,4,5,5,6,7,7,7};
        int j=0,i=0;
        for(;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[i];
        System.out.println(j-1);
        System.out.println(Arrays.toString(arr));
    }
}