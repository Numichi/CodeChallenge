package tasks.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    private Map<Integer, Character> symbol = new HashMap<>();
    
    public IntegerToRoman() {
        this.symbol.put(1, 'I');
        this.symbol.put(5, 'V');
        this.symbol.put(10, 'X');
        this.symbol.put(50, 'L');
        this.symbol.put(100, 'C');
        this.symbol.put(500, 'D');
        this.symbol.put(1000, 'M');
    }
    
    public String intToRoman(int num) {
        StringBuilder ret = new StringBuilder();
        
        for (int x : new int[] {
            1000,
            100,
            10,
            1
        }) {
            int value = num / x;

            switch (value) {
                case 0:
                    break;
                case 1:
                    ret.append(this.symbol.get(x));
                    break;
                case 2:
                    ret.append(this.symbol.get(x));
                    ret.append(this.symbol.get(x));
                    break;
                case 3:
                    ret.append(this.symbol.get(x));
                    ret.append(this.symbol.get(x));
                    ret.append(this.symbol.get(x));
                    break;
                case 4:
                    ret.append(this.symbol.get(x));
                    ret.append(this.symbol.get(x * 5));
                    break;
                case 5:
                    ret.append(this.symbol.get(x * 5));
                    break;
                case 6:
                    ret.append(this.symbol.get(x * 5));
                    ret.append(this.symbol.get(x));
                    break;
                case 7:
                    ret.append(this.symbol.get(x * 5));
                    ret.append(this.symbol.get(x));
                    ret.append(this.symbol.get(x));
                    break;
                case 8:
                    ret.append(this.symbol.get(x * 5));
                    ret.append(this.symbol.get(x));
                    ret.append(this.symbol.get(x));
                    ret.append(this.symbol.get(x));
                    break;
                case 9:
                    ret.append(this.symbol.get(x));
                    ret.append(this.symbol.get(x * 10));
                    break;
            }
            
            if (0 < value && value < 10) {
                num %= x;
            }
        }
        
        return ret.toString();
    }
}
