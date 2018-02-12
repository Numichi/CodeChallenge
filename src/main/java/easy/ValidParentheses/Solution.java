package easy.ValidParentheses;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution
{
    private Set<Character>   push  = new HashSet<>();
    private Stack<Character> stack = new Stack<>();
    
    public Solution()
    {
        push.add('[');
        push.add('(');
        push.add('{');
    }
    
    public boolean isValid(String s)
    {
        this.stack.clear();
        
        for(char c : s.toCharArray()) {
            if(push.contains(c)) {
                this.stack.push(c);
            } else if(!this.pop(c)) {
                return false;
            }
        }
        
        return this.stack.size() == 0;
    }
    
    private boolean pop(char c)
    {
        if(this.stack.size() == 0) {
            return false;
        }
        
        switch(this.stack.pop()) {
            case '(':
                return c == ')';
            case '[':
                return c == ']';
            case '{':
                return c == '}';
            default:
                return false;
        }
    }
}
