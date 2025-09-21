public class LinearSearch {
    public static void main(String args[]){
        int[] arr = {50,89,10,12,47,96,50,774,56,78,99};
        int key = 99;
        for(int i = 0;i<arr.length;i++){
            if(key == arr[i]){
                System.out.print("Elemment found at index: " + i);
            }

        }
    }
}
