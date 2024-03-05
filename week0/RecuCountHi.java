public class RecuCountHi {
    public static void main(String[] args) {
        System.out.println(countHi("xhixhiix"));
    }
    public static int countHi(String str) {
        if(str.length()<2){
            return 0;
        }else if(str.substring(0,2).equals("hi")){
            return 1+countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }
}
