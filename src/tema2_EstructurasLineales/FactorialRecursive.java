package tema2_EstructurasLineales;

public class FactorialRecursive {

    public static void main(String[] args) {
        System.out.println("n! : " + factn(10));
    }

    public static int factn(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factn(n - 1);

    }
}
