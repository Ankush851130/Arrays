import java.util.Arrays;
public class SecondMax {
    public static void main(String args[]){
      int[] arr = {10,50,63,41,85,21,3,7,9,85};
    int max = Integer.MIN_VALUE;
    int Smax = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length;i++){
        if(max < arr[i]) max = arr[i];
    }

    for(int i = 0;i<arr.length;i++){
        if(Smax < arr[i] && arr[i] != max) Smax = arr[i];
    }

    System.out.println(max);
    System.out.println(Smax);
    }
    
}
