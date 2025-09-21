import java.util.*;
public class PssingArraybyMethod {
        public static void main(String args[]){
        int[] x = {10,20,80,90};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y){
        y[2] = 40;
    }
}