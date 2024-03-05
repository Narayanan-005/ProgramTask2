public class RemoveAdjucentDuplicate {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("sadkkdassa");
        for(int i=0;i<sb.length()-1;){
            if(sb.charAt(i)==sb.charAt(i+1)){
                sb.delete(i, i+2);
            }else if(i>0 && sb.charAt(i)==sb.charAt(i-1)){
                sb.delete(i-1, i+1);
                i--;
            }else {
                i++;
            }
        }
        System.out.println(sb);
    }
}
