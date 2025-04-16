// How to find the maximum product subarray. Write its algorithm, program. Find its time 
// and space complexities. Explain with suitable example. 

public class Ques19 {
    public static int maxProdSubarray(int arr[]){
        int start=1;
        int prod=1;
        int maxProd= arr[0];

        for(int stop=0;stop<arr.length;stop++){
            prod*=arr[stop];
            maxProd= Math.max( maxProd,prod);

        }


        return maxProd;
    }
    public static void main(String[] args) {
        int arr[]= {2,3,-2,4};
        System.out.println(maxProdSubarray(arr));
    }
    
}
