// Check if an array can be split into two parts such that the sum of the prefix equals the 
// sum of the suffix. Write its algorithm, program. Find its time and space complexities. 
// Explain with suitable example. 

public class Ques4 {
    public static boolean canSplit(int arr[]){
        if(arr.length== 1 ){
            return false;
        }
        int n=arr.length;
        int prefixSum[]= new int[n];

        prefixSum[0]=arr[0];
        for (int i = 1; i <= n-1; i++) {
            prefixSum[i]= prefixSum[i-1]+arr[i];
            
        }
        if(prefixSum[n-1]%2 != 0){
            return false;
        }
        int leftSum=0;
        int rightSum=0;
        for (int i = 0; i < prefixSum.length; i++) {
            leftSum=prefixSum[i];
            rightSum= prefixSum[n-1]- prefixSum[i];

            if(leftSum == rightSum){
                return true;
            }
            
        }

        
        return false ;
    }
    public static void main(String[] args) {
       int  arr[] = {5, 1, 2, 1};
       System.out.println(canSplit(arr));
        
    }
    
}
