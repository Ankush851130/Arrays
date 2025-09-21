import java.util.Arrays;
public class ReverseArray{
    public static void main(String args[]){
        int[] arr = {14,18,45,7,96,21,74};
        int n = arr.length;
        int i = 0,j=n-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // for(int ele : arr){
        //     System.out.print(ele + " "); // Here using for each loop concept
        // }
        System.out.println(Arrays.toString(arr)); // It is for square bracket both the end.
    }
}