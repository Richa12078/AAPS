// Write a program to find the sum of elements in a given range [L, R] using a prefix sum  
// array. Write its algorithm, program. Find its time and space complexities. Explain with 
// suitable example.

public class Ques2{
    public static int sumRange(int arr[] , int L, int R){
        int prefArr[]= new int[arr.length];

        prefArr[0]= arr[0];
        for (int i = 1; i < prefArr.length; i++) {
            prefArr[i]= arr[i]+prefArr[i-1];

        }
        if(L==0){
            return arr[R];
        }
        
     return prefArr[R]-prefArr[L-1];
    }

    public static void main(String[] args) {
        int arr[]= {3,6,2,8,9};
        int L=1;
        int R= 3;
        System.out.println(sumRange(arr, L, R));
        
    }
}