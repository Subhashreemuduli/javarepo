import javax.crypto.SealedObject;
import java.util.ArrayList;
import java.util.Stack;

public class StackProgram {
    public static void main(String[] args)
    {
        Stack<String> stack=new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.search('c'));

    }
}
