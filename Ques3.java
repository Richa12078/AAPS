// Solve the problem of finding the equilibrium index in an array. Write its algorithm, 
// program. Find its time and space complexities. Explain with suitable example.

public class Ques3 {
    public static int equilibrum(int arr[]){

        int n=arr.length;
        int rightSum = 0;
        int leftSum=0;
        
        int prefArr[]= new int[n];
        prefArr[0]=arr[0];

        for (int i = 1; i < n; i++) {
            prefArr[i]= arr[i]+ prefArr[i-1];
            
        }
        int totalSum=prefArr[n-1];
        for (int i = 1; i < n; i++) {
            leftSum = prefArr[i-1];
            rightSum = totalSum-prefArr[i];
            if(rightSum== leftSum){
                return i;
            }
            
        }

      
        return 0;
    }
    public static void main(String[] args) {
        int arr[]= {-7, 1, 5, 2, -4, 3, 0};
        
        System.out.println(equilibrum(arr));
    }
    
}
