// Find the maximum sum of any subarray of size K in a given array. Write its algorithm, 
// program. Find its time and space complexities. Explain with suitable example.  

public class ques5 {
    public static int subarraySum(int arr[], int k){
        int n=arr.length;
        if(n <k ){
            return -1;
        }
        int pref[]= new int[n];
        pref[0]=arr[0];

        for (int  i = 1; i < n; i++) {
            pref[i]= arr[i]+ pref[i-1];
        }
        int maxSum= pref[k-1];
        int currSum=0;
        for (int i = k; i < n; i++) {
            currSum=pref[i]- pref[i-k];
            maxSum = Math.max(currSum,maxSum);
            
        }
        return maxSum;


    }
    public static void main(String[] args) {
        int []arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k=4;
        System.out.println(subarraySum(arr, k));
    }
    
}
