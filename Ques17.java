// Calculate how much water can be trapped between the bars of a histogram. Write its 
// algorithm, program. Find its time and space complexities. Explain with suitable 
// example.


public class Ques17 {
    public static int rainwater(int [] height){
        int n=height.length;
        int max= height[0];
        int left[]= new int[n];
        left[0]= height[0];
        for(int i=1 ; i<n ; i++ ){
            left[i]= Math.max(height[i], left[i-1]);
            if( left[i]> max){
                max= left[i];
            }
        }

        int right[]= new int[n];
        right[n-1]= height[n-1];
        for (int i = n-2; i >= 0; i--) {
            right[i]= Math.max(height[i], max);
            if(height[i] > max ){
                max= height[i];
            }
            
        }

        int ans=0;
        for(int i=0; i< n; i++){
         ans+= Math.min(left[i], right[i] )- height[i];
        }
        return ans;

    }

       

        
       
    public static void main(String[] args) {
        int arr[]= {4,2,0,3,2,5};
        System.out.println(rainwater(arr));
        
    }
    
}
