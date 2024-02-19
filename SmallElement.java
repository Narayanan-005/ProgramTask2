class SmallElement {
    static int [] arr={4,5,7,1,10};
    public static void main(String[] args) {
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}
