import java.util.*;
public class SumofElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<=n-1;i++){
            sum = sum + arr[i];
        }
        System.out.print(sum);


    }
}
