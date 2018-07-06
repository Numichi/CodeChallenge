package tasks.leetcode.medium;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
    private Map<Integer, List<Character>> keyboard = new HashMap<>();
    
    public LetterCombinationsOfAPhoneNumber() {
        keyboard.put(2, new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        keyboard.put(3, new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        keyboard.put(4, new ArrayList<>(Arrays.asList('h', 'g', 'i')));
        keyboard.put(5, new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        keyboard.put(6, new ArrayList<>(Arrays.asList('m', 'n', 'o')));
        keyboard.put(7, new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
        keyboard.put(8, new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        keyboard.put(9, new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));
        keyboard.put(0, new ArrayList<>(Collections.singletonList(' ')));
    }
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        // Input is empty
        if (digits.length() == 0) {
            return result;
        }
        
        
        result.add("");
        
        for (char c : digits.toCharArray()) {
            int i = Character.getNumericValue(c);
            List<String> temp = new ArrayList<>();
            
            for (String x : result) {
                for (char c1 : keyboard.get(i)) {
                    temp.add(x + c1);
                }
            }
            
            result = temp;
        }
        
        return result;
    }
}
