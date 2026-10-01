import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        // last-opened, first-closed order — so use Stack
        
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.push(')');

            else if (ch == '{')
                stack.push('}');

            else if (ch == '[')
                stack.push(']');

            else if (stack.isEmpty() || stack.pop() != ch)  
                return false;
        }
        return stack.isEmpty();
    }
}
