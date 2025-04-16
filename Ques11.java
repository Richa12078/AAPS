// . Find two numbers in a sorted array that add up to a target. Write its algorithm, program. 
// Find its time and space complexities. Explain with suitable example.

public class Ques11 {
    // public static void add( int arr[], int target){
    //     for(int i=0;i< arr.length;i++){
    //         for(int j=1 ;j< arr.length ; j++){
    //             if(arr[i] + arr[j] == target){
    //                 System.out.print(i +" "+j);
                    
    //             }
               
    //         }
    //         System.out.println();
    //     }


    // }

        public static void add( int arr[], int target){
            int left=0; 
            for(int right=0; right< arr.length ;right++){
                if ( arr[left]+arr[right] == target ){
                    System.out.println( left+ ""+right);
                }
                else{left++;
                }
            }
        }

    public static void main(String[] args) {
        int arr[]={1, 3, 4, 6, 8, 10, 12};
        int target= 14;
       add(arr, target);
    }
    
}
