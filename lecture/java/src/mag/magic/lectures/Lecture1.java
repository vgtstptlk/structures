package mag.magic.lectures;

import mag.magic.structures.Stack;
import mag.magic.structures.StackPlus;

import java.util.ArrayList;

public class Lecture1 {

    /*Проверяет скобки*/
    public static boolean isBalanced(String string){
        StackPlus<String> stack = new StackPlus<String>();
        for (int i = 0; i < string.length(); i++){
            String localChar = string.substring(i, i+1);
            if ("(".equals(localChar) || "[".equals(localChar)){
                stack.push(localChar);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                String top = stack.pop();
                if (("[".equals(top) && !"]".equals(localChar)) || ("(".equals(top) && !")".equals(localChar))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static Stack<Integer> getWindowMinimum(ArrayList<Integer> numbers, Integer m){
        return null;
    }
}
