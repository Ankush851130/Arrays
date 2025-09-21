public class MaxofElement {
    public static void main(String args[]){
        int[] arr = {14,-47,56,85,78,96};
        int max = arr[0];
        for(int i = 0;i< 6;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
