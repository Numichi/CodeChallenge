package easy;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses
{
    private Set<Character>   push  = new HashSet<>();
    private Stack<Character> stack = new Stack<>();
    
    public ValidParentheses()
    {
        push.add('[');
        push.add('(');
        push.add('{');
    }
    
    public boolean isValid(String s)
    {
        this.stack.clear();
        
        for(char c : s.toCharArray()) {
            if(!this.process(c)) {
                return false;
            }
        }
        
        return this.stack.isEmpty();
    }
    
    private boolean process(char c)
    {
        // PUSH '(', '[', '{'
        if(this.push.contains(c)) {
            this.stack.push(c);
            return true;
        }
        
        // stack is empty -> syntax problem
        if(this.stack.isEmpty()) {
            return false;
        }
        
        // expect character
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
