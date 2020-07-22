package mag.magic.practice;

import mag.magic.structures.Stack;

import java.util.Scanner;

/*
Возможно тут внутри методов будут всякие сканеры и тд, но не удивляйтесь, это просто надо для сдачи задач в системе
курсеры, чтобы сильно не видоизменять решения каждый раз
 */
public class Practice1 {

    // program 1
    public static void bracketsCheck(){
        var in = new Scanner(System.in);
        var line = in.nextLine();
        Stack<String> stack = new Stack<>();
        Stack<Integer> opened = new Stack<>();
        Stack<Integer> closed = new Stack<>();

        for (int i = 0; i < line.length(); i++){
            var symbol = line.substring(i, i+1);
            if ("(".equals(symbol) || "[".equals(symbol) || "{".equals(symbol)){
                stack.push(symbol);
                opened.push(i+1);
            }
            if (")".equals(symbol) || "]".equals(symbol) || "}".equals(symbol)) {
                var lastBracket = stack.top();
                if (!stack.isEmpty()) {

                    if (")".equals(symbol) && "(".equals(lastBracket)
                            || "]".equals(symbol) && "[".equals(lastBracket)
                            || "}".equals(symbol) && "{".equals(lastBracket)) {
                        stack.pop();
                        opened.pop();
                    }
                    else {
                        closed.push(i+1);
                        break;
                    }

                }
                else{
                    stack.push(symbol);
                    closed.push(i+1);
                    break;
                }

            }
        }
        if (!stack.isEmpty()){
            int idx=0;
            if (!closed.isEmpty()){
                while(!closed.isEmpty()){
                    idx = closed.pop();
                }
                System.out.println(idx); // Можно было бы сделать через массив,
            }                           // но я захотел всё через стек (все-таки тема про стек)
            else if (!opened.isEmpty()){
                while(!opened.isEmpty()){
                    idx = opened.pop();
                }
                System.out.println(idx);
            }
        }
        else {
            System.out.println("Success");
        }
    }

}
