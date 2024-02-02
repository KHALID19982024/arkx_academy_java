package Day9DataStructure;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackImplementation {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();

        //push() method adds the element in the stack

        stack.push(6);
        stack.push(12);
        stack.push(-4);
        stack.push(10);
        stack.push(-11);

        //method removes the element from the stack

        stack.pop();
        stack.pop();


//Peek (get the element at the top of the stack without removing it)
        try {
            int last_element = stack.peek();
            System.out.println("The last element of the stack " + last_element);
        }catch (EmptyStackException err)
        {
            System.out.println("system message: "+err.getMessage()+" stack");
        }
        //check if isn't a empty stack and display
        if (!stack.isEmpty())
        {
            System.out.println("Stack elements: ");

            for(int items: stack) {
                System.out.println(items);
            }
        }
    }
}


