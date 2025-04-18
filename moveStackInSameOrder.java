import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc=new Scanner(System.in);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //storing elements in stack st
//        System.out.println("enter no. of elements ");
//        int n=sc.nextInt();
//        System.out.println("enter the elements ");
//        for(int i=1; i<=n; i++){
//            int x=sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);

        //reversing stack st
        Stack<Integer> st2 =new Stack<>();
        while(st.size()>0){
            //st2.peek();
            st2.push(st.pop()); //st ka popped element st2 me push ho rha
        }
        System.out.println(st2);

        Stack<Integer> copied = new Stack<>();
        while(st2.size()> 0){
            copied.push(st2.pop());
        }
        System.out.println(copied);
    }
}
