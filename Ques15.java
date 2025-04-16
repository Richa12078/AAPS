// Find the k-th smallest element in a sorted matrix. Write its algorithm, program. Find its 
// time and space complexities. Explain with suitable example. 

import java.util.Arrays;

public class Ques15 {
    public static int smallest(int arr[][], int k){
     //   Arrays.sort(arr); //time-- nlog(n)
     return -1;


    }
    public static void main(String[] args) {
        int arr[][]={{1,5,9},{10,11,13},{12,13,15}};
        int k =8;
        System.out.println(smallest(arr, k));
    }
    
}
