import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=2; i<n; i++) {
            if (n % i == 0) {
                System.out.println("It is not a prime no.");
                return;
            }
        }
        System.out.println("It is a prime");
    }
}