import java.util.*;
public class multipleof3and5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int count3 = 0;
        int count5 = 0;
        int countBoth = 0;

        int n = scn.nextInt();

        for (int i = 0; i<=n; i++){
            if ((i%3==0) && (i%5==0)){
                countBoth++;
            } else if (i%3==0) {
                count3++;
            }else if (i%5==0) {
                count5++;
            }
        }
        System.out.println("Multiple of 3 are :"+count3);
        System.out.println("Multiple of 5 are :"+count5);
        System.out.println("Multiple of 3 and 5 are :"+countBoth);

    }
}
