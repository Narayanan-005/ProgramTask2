import java.util.Arrays;
import java.util.Scanner;

public class SumTwoArray {
    public static void main(String[] args) {
        SumTwoArray twoArray=new SumTwoArray();
        int input1[]=twoArray.input();
        int input2[]=twoArray.input();
        int output[];
        if(input1.length>input2.length){
            output=twoArray.sumTwo(input1,input2);
        }else {
            output=twoArray.sumTwo(input2,input1);
        }
        System.out.println(Arrays.toString(output));

    }
    public int[] sumTwo(int arr1[],int []arr2){
        int carry=0;
        int temp=0;
        int output[]=new int[arr1.length+1];
        for(int i=arr1.length-1,j=arr2.length-1,k=output.length-1;i>=0;i--,j--,k--){
            if(j>=0){
                temp=arr1[i]+arr2[j]+carry;
            }else {
                temp=arr1[i]+carry;
            }
            arr1[i]=temp%10;
            output[k]=temp%10;
            temp/=10;
            carry=temp;
        }
        if(carry==0){
            return arr1;
        }else {
            output[0]=carry;
            return output;
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
