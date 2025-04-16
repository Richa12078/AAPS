// Find the length of the longest substring without repeating characters. Write its 
// algorithm, program. Find its time and space complexities. Explain with suitable 
// example

import java.util.HashSet;

public class Ques6 {
    public static int longest(String s){
        HashSet <Character> set= new HashSet<>();

    
        int left =0; 
        int right=0; int max=0;
       

            while(right< s.length()){
              char ch= s.charAt(right);
            
              while(set.contains(ch)){
               set.remove(s.charAt(left)) ;
                left++;
               }
               set.add(ch);
               max=Math.max(max, right-left+1);
               right++;


            }
       

        return max;
    }


    // public static int longest(String s){

    //     int count=0;
    //     int max=0;
    //     int left=0;
    //     int right=1;
    //     for (int i = 0; i < s.length(); i++) {
    //         if( s.charAt(left) != s.charAt(right)){
    //             right++;
    //             count++ ;

    //         }
    //         if(s.charAt(left) == s.charAt(right)){
    //             left++;
    //             count= right-left+1;
    //         }
    //         max= Math.max(max, count);
            
    //     }
    //     return max; 
    //     }
        
    public static void main(String[] args) {
         String s= "abcabcbb";
         System.out.println(longest(s));
        
    }
    
}
