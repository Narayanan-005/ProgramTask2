public class RecuNestParen {

    public static void main(String[] args) {
        System.out.println(nestParen("(((x))"));
    }
    public static boolean nestParen(String str) {
        if(str.equals("") || Character.isLetter(str.charAt(0))){
            return true;
        }else if(str.charAt(0)=='(' ^ str.charAt(str.length()-1)==')'){
            return false;
        }
        return nestParen(str.substring(1, str.length()-1));
    }
}