import java.util.Stack;

class M11_Stack{
    public static void main(String[] args) {
        
        Stack<Integer> stk = new Stack<>();

        System.out.println("is stack empty : "+stk.isEmpty());

        stk.push(598);
        stk.push(599);
        stk.push(590);
        stk.push(566);

        System.out.println(stk);
        System.out.println("is stack empty : "+stk.empty());
        System.out.println("deleting the top element :"+stk.pop());
        System.out.println("Now, the top element is : "+stk.peek());
        System.out.println(stk);
        System.out.println("size of stack is "+stk.size());
        System.out.println("location of 590 is "+stk.search(590));
    }
}

/*
Note : 
-> The stack is a linear data structure that is used to store collection of obj.  
-> Stack follow Last-In-First-Out principle.
-> In java, Stack is a class that falls under the COllection framework that
   extends the Vector class.
-> Stack also implements the interfaces List, Collection, Iterable, Clonable 
   and Serialiaable.
*/