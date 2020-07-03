package mag.magic.lectures;

import mag.magic.structures.Stack;

public class Lecture1 {
    public static boolean isBalanced(String string){
        Stack<String> stack = new Stack<>();
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
}
