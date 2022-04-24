import java.util.*;
public class pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for (int j=i+1; j<=n; j++){
                if ((i+j)%2==0){
                    System.out.printf("%d %d%n", i, j);
                }
            }
        }
    }
}
