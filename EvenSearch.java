import java.util.*;

public class EvenSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] num = new int[size];
        for (int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }

        int count = 0;
        int i=0;
        while(i<size){
            if (num[i]%2==0){
                count++;
            }
            i++;
        }

        System.out.println(count);
    }
}