// public class OutputInputArray {
// public static void main(String[] args){
//     int[] arr = {25,14,96,47,50,87,45,02,41};
//     System.out.println(arr.length);
//     for(int i = 0;i<=arr.length;i++){
//         System.out.print(arr[i] + " ");
//     }
// }
import java.util.*;
public class OutputInputArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [] karan = new int[8];
        for(int i = 0;i<=7;i++){
            karan[i] = sc.nextInt();
        }
        for(int i = 1;i<=7;i++){
            System.out.print(karan[i]+ " ");
        }
    }
}
