// Find the majority element in an array that appears more than n/2 times. Write its 
// algorithm, program. Find its time and space complexities. Explain with suitable 
// example.



import java.util.Arrays;

public class Ques16 {
    public static int majority(int arr[]){
        int n=arr.length;
        int maxCount=0;
       Arrays.sort(arr);
        int count=1;
        int ans = arr[0];
        for(int i=1 ; i<arr.length-1; i++ ){
            if(arr[i]== arr[i-1]){
                count++;
                
            }
            else{
                count=1;
            
            }
            if(count> maxCount){
                maxCount=count ;
                ans=arr[i];
            }

        }
        if(maxCount > n/2){
            return ans;
        }
        else{
        return -1;
        }
    }
    
    public static void main(String args[]){
        int arr[]={1,1,2,3,1,1,6,1,3};
        System.out.println(majority(arr));
    }
}
