import java.util.Arrays;
public class SortArraybuiltin {
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50,60};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
