package mag.magic.structures;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stack = new ArrayList<T>();

    public void push(T object){
        stack.add(object);
    }

    public T pop(){
        T object = stack.get(stack.size()-1);
        stack.remove(object);
        return object;
    }

    public T top(){
        return stack.get(stack.size()-1);
    }

    public boolean isEmpty(){
        return stack.size() == 0;
    }
}
