public class RecContainsSIngleParanthesis {
    public static void main(String[] args) {
        System.out.println(parenBit("(abc)1233"));
    }
    public static String parenBit(String str) {
        if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')'){
            return str;
        }else if(str.charAt(0)!='('){
            return parenBit(str.substring(1));
        }
        return parenBit(str.substring(0,str.length()-1));
    }
}
