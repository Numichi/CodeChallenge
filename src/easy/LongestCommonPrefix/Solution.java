package easy.LongestCommonPrefix;

import java.util.HashSet;
import java.util.Set;

public class Solution
{
    private String[] strArr;

    private int c0;
    private int c1;
    private int c2;

    public String longestCommonPrefix(String[] strArr)
    {
        if(strArr == null || strArr.length == 0) {
            return "";
        }

        this.strArr = strArr;

        // {"aaaa", "aaaa", "aaaa", "aaaa"}
        if(this.isOk(null)) {
            return strArr[0];
        }

        try {
            this.c0 = 0;
            this.c1 = this.getShortest();

            // {"a"}
            if(this.c1 == 1) {
                throw new CantCutException();
            }

            this.c2 = this.c1;
            this.search();
        } catch (CantCutException e) {
            if(this.isOk(this.c1)) {
                return strArr[0].substring(0, this.c1);
            }
        }

        return "";
    }

    private void search() throws CantCutException
    {
        Set<String> set = new HashSet<>();
        boolean cut = true;

        for(String value : this.strArr) {
            set.add(value.substring(0, this.c1));

            if(1 < set.size()) {
                cut = false;
                break;
            }
        }

        this.cut(cut);
        this.search();
    }

    /**
     * false - cut left
     * true - cut right
     *
     * [=====|-----] <- default
     *
     * FALSE:
     * [==|--|-----]
     * TRUE:
     * [=====|==|--]
     */
    private void cut(boolean x) throws CantCutException
    {
        if(x) {
            this.c0 = this.c1;
            this.c1 = this.c1 + (this.c2 - this.c1) / 2;
        } else {
            this.c2 = this.c1;
            this.c1 = (this.c0 + this.c2) / 2;
        }

        if(this.c1 == this.c2 || this.c1 == this.c0) {
            throw new CantCutException();
        }
    }

    private boolean isOk(Integer length)
    {
        Set<String> set = new HashSet<>();

        for(String value : this.strArr) {
            value = (length == null) ? value : value.substring(0, length);

            set.add(value);

            if(1 < set.size()) {
                return false;
            }
        }

        return true;
    }

    private int getShortest()
    {
        int min = Integer.MAX_VALUE;

        for(String s : this.strArr) {
            if(s.length() < min) {
                min = s.length();
            }
        }

        return min;
    }
}
