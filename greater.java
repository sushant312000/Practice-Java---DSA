import java.util.*;
public class greater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int firstNo = scn.nextInt();
        int secNo = scn.nextInt();

        if (firstNo > secNo){
            System.out.println("First No. is greater");
        }
        else {
            System.out.println("Second no. is greater");
        }
    }
}