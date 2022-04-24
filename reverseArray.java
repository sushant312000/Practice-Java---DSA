
// import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 8};

//        int[] newArr;
        int start = 0;
        int end = arr.length - 1;
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        int i = 0;
        while(i<arr.length){
            System.out.printf("%d ", arr[i]);
            i++;
        }

//        System.out.println(Arrays.toString(arr));
    }

}
