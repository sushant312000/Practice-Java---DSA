import java.util.*;
public class ElementSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] num = new int[size];

        for (int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        boolean flag = false;
        for (int i=0; i<size; i++){
            if (num[i]==ele){
                System.out.println("Found");
                flag = true;
            }
        }
        if (flag==false){
            System.out.println("Not found");
        }
    }
}
