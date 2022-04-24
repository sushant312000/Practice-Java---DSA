public class atoz {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
        System.out.println("0 to 9 No. are");
        for (int i = 0; i<=9; i++){
            System.out.print(i+" ");
        }

        System.out.println("A to Z alphabets are: ");
        for (char ch='A'; ch<='Z'; ch++ ){
            System.out.println(ch+ " ");
        }
    }
}