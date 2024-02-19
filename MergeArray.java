class MergeArray {
    static int [] arr1={2,4,5,6,7,9,10,13};
    static int [] arr2={2,3,4,5,6,7,8,9,11,15};
    public static void main(String[] args) {
        int i=0,j=0;
        for(;i<arr1.length && j<arr2.length;){
            if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }else if(arr1[i]>arr2[j]){
                System.out.println(arr2[j]);
                j++;
            }else{
                System.out.println(arr1[i]);
                i++;
            }
        }
        if(i<arr1.length){
            while(i<arr1.length){
                System.out.println(arr1[i]);
                i++;
            }
        }else if(j<arr2.length){
            while(j<arr2.length){
                System.out.println(arr2[i]);
                j++;
            }
        }
    }
}
