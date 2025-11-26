import java.util.Stack;
import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        
        // Создаем пары скобок
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        
        for (char c : s.toCharArray()) {
            // Если это закрывающая скобка
            if (map.containsKey(c)) {
                // Проверяем соответствие с последней открывающей скобкой
                char top = stack.isEmpty() ? '#' : stack.pop();
                if (top != map.get(c)) {
                    return false;
                }
            } 
            // Если это открывающая скобка - кладем в стек
            else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}