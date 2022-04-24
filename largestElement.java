import java.util.*;
public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] num = new int[size];
        for (int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        int large = num[0];

        for (int i=0;i<size; i++){
            if (num[i]>large){
                large = num[i];
            }
        }
        System.out.println(large+ " is the largest");
    }
}
