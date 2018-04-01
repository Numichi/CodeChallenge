package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger
{
    private Map<Character, Integer> symbol = new HashMap<>();

    public RomanToInteger()
    {
        this.symbol.put('I', 1);
        this.symbol.put('V', 5);
        this.symbol.put('X', 10);
        this.symbol.put('L', 50);
        this.symbol.put('C', 100);
        this.symbol.put('D', 500);
        this.symbol.put('M', 1000);
    }

    public int romanToInt(String s)
    {
        int current = 0;
        int size = s.length();

        char cNext;
        char cSymbol;
        int iNext;
        int iSymbol;
        for(int i = 0; i < size; i++) {
            if(i < size - 1) {
                cNext = s.charAt(i + 1);
                iNext = this.symbol.get(cNext);
            } else {
                iNext = 0;
            }

            cSymbol = s.charAt(i);
            iSymbol = this.symbol.get(cSymbol);

            if(iSymbol < iNext) {
                current -= iSymbol;
                iSymbol = iNext;
                i++;
            }

            current += iSymbol;
        }

        return current;
    }
}
