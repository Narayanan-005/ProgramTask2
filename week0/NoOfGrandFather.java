import java.util.ArrayList;
import java.util.List;

public class NoOfGrandFather {

    public static void main(String[] args) {
        String [][]arr={{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
        String grandF="ronaldo";
        int count=0;
        List<String> childs=new ArrayList();
        for(int i=0,j=1;i<arr.length;i++){
            if(arr[i][j].equals(grandF)){
                childs.add(arr[i][j-1]);
            }
        }
        for(int i=0,j=1;i<arr.length;i++){
            if(childs.contains(arr[i][j])){
                count++;
            }
        }
        System.out.println(grandF+" has "+count+" two grandchild");
    }
}