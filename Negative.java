import java.util.*;
public class Negative {
    public static void main(String args[]){
        // int[] arr = {12,-14,45,-74,20};
        // for(int i = 0;i<=4;i++){
        //     if(0 > arr[i] ){
        //         System.out.print(arr[i]);
        //     }
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array");
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Negative elements is: ");
        for(int i = 0;i<=n-1;i++){
            
            if(0 > arr[i]){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
