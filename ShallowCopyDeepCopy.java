import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String args[]){
        int[] arr = {10,20,30,40};
        // int[] x = arr; // Shallow copy of arr
        // x[0] = 14;
        // System.out.print(arr[0]);

        int[] deep = Arrays.copyOf(arr,arr.length);
        deep[0] = 79;
        System.out.println(deep[0]);
        System.out.println(arr[0]);


    }
}



