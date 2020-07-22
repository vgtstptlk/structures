package mag.magic.structures;

import java.util.ArrayList;

public class StackPlus<T extends Comparable<? super T>> {
    private ArrayList<T> stack = new ArrayList<T>();
    private ArrayList<T> maxValue = new ArrayList<T>();
    private ArrayList<T> minValue = new ArrayList<T>();

    public void push(T object){
        if (maxValue.isEmpty()){
            maxValue.add(object);
        }
        else{

            if (maxValue.get(maxValue.size()-1).compareTo(object) < 0){
                maxValue.add(object);
            }
            else {
                maxValue.add(maxValue.get(maxValue.size()-1));
            }
        }

        if (minValue.isEmpty()){
            minValue.add(object);
        }
        else {
            if (minValue.get(minValue.size()-1).compareTo(object) > 0){
                minValue.add(object);
            }
            else {
                minValue.add(minValue.get(maxValue.size()-1));
            }
        }
        stack.add(object);
    }

    public T pop(){
        T object = stack.get(stack.size()-1);
        stack.remove(object);
        maxValue.remove(maxValue.size()-1);
        return object;
    }

    public T getMax(){
        return maxValue.get(maxValue.size()-1);
    }

    public T getMin(){
        return minValue.get(minValue.size()-1);
    }

    public T top(){
        return stack.get(stack.size()-1);
    }

    public boolean isEmpty(){
        return stack.size() == 0;
    }
}
