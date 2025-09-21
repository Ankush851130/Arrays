import java.util.Arrays;
public class OddandEven {
    public static void main(String args[]){
     int[] arr = {10,20,60,50,80,68,14};
    for(int i = 0;i<arr.length;i++){
        if(i % 2 == 0){
            arr[i] = arr[i] + 10;
        }
        else{
            arr[i] = arr[i] * 2;
        }
        
    }
    print(arr);
    } 

    public static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

