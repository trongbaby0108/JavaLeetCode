import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        for (char i : s.toCharArray()) {
            if(i == '(' || i == '{' || i == '[')
            {
                temp.push(i);
            }
            else
                if(temp.empty())
                {
                    return false;
                }
            else {
                char top = temp.peek();
                if(top == '{' && i == '}' || top == '(' && i == ')' || top == '[' && i == ']')
                    temp.pop();
                else return false;
            }
        }
        if(temp.isEmpty())
            return true;
        else
            return false;

    }
}
