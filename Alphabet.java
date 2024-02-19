import java.util.*;
class Alphabet {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        char ch=s.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.println("The given character is Alphabet");
        }else {
            System.out.println("The given character is not Alphabet");
        }
    }
}
