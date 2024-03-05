public class RecuSquar {

    public static void main(String[] args) {
        System.out.println(powerN(3, 3));
    }

    public static int powerN(int n,int count) {
        if (count==0) {
            return 1;
        }
        return n*powerN(n, count-1);
    }
}