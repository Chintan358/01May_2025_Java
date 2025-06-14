package collections;

import java.util.Stack;

public class C009_Stack {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);


        for(int i : st)
        {
            System.out.println(i);
        }

        System.out.println("**************");

        System.out.println(st.pop());

        System.out.println("************");

        for(int i : st)
        {
            System.out.println(i);
        }

        System.out.println("**************");

        System.out.println(st.peek());
        System.out.println("************");

        for(int i : st)
        {
            System.out.println(i);
        }

    }
}
