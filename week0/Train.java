import java.util.Arrays;
import java.util.Scanner;

public class Train {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Train departs from A:");
        int a=s.nextInt();
        System.out.println("Train departs from B:");
        int b=s.nextInt();
        String [][]arrA=inputArr(a, 'A');
        String [][]arrB=inputArr(b, 'B');
        b=noOfTrains(arrA, arrB, b);
        a=noOfTrains(arrB, arrA, a);
        System.out.println("Total Trains needed at station A is "+a+" Total Trains needed at station B is "+b);
    }
    public static String[][] inputArr(int n,char ch) {
        System.out.println("Train schedule from "+ch+":");
        String [][] arr=new String[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=s.next();
            arr[i][1]=s.next();
        }
        return arr;
    }
    public static int noOfTrains(String [][]arr1,String [][]arr2,int n) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i][1].compareTo(arr2[j][0])<0){
                    n--;
                    arr2[j][0]="";
                    break;
                }
            }
        }
        return n;
    }
}
