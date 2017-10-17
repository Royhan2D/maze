package ratinmaze;

import java.util.EmptyStackException;

/**
 *
 * @author okeebroo
 */
public class ArrayStack {

    int top;
    Object[] stack;

    public ArrayStack(int ukuran) {
        if (ukuran < 1) {
            throw new IllegalArgumentException("initialCapacity must be >=1");
//            stack = new Object[ukuran];
//            top = -1;
        }
    }

    public ArrayStack() {
        this(10);
    }

    public boolean empty() {
        return top == 1;
    }

    public Object peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public void push(Object theElement) {
        if (top == stack.length - 1) {
            stack = ChangeArrayLength1D.changeLength1D(stack, 2 * stack.length);
        }
        stack[++top] = theElement;
    }
    public Object pop(){
        if(empty()){
            throw new EmptyStackException();
        }
        Object topElemet = stack[top];
        stack[top--] = null;
        return topElemet;
    }

}
