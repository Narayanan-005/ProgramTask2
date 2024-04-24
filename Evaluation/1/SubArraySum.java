import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        SubArraySum subArraySum=new SubArraySum();
        int input[]=subArraySum.input();
        subArraySum.sumNonNegative(input);
    }

    public void sumNonNegative(int arr[]){
        int sum=0,max=0,count=0,start=0,end=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0){
                sum=0;
                count=0;
            }else {
                sum+=arr[i];
                count++;
            }
            if(sum>max){
                max=sum;
                start=i-count+1;
                end=i;
            }
        }
        System.out.println("Sum:"+max);
        System.out.print("Elements:");
        while (start<=end){
            if(start==end){
                System.out.print(arr[start]);
            }else {
                System.out.print(arr[start]+",");
            }
            start++;
        }
    }

    public int[] input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
}
