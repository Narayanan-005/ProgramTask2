public class RecContains6 {

    public static void main(String[] args) {
        int []arr={1,6,4};
        System.out.println(array6(arr, 0));
    }
    public static boolean array6(int []arr,int i) {
        if(i==arr.length){
            return false;
        }else if(arr[i]==6){
            return true;
        }
        return array6(arr, i+1);
    }
}