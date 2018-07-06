package tasks.codility.lessons;

class GenomicRangeQuery {
    
    public int[] solution(
        String S,
        int[] P,
        int[] Q
    ) {
        int[] result = new int[P.length];
        int len = S.length();
        int[][] cache = new int[4][len];
        
        for (int i = 0; i < len; i++) {
            char c = S.charAt(i);
            cache[0][i] = ('A' == c) ? 1 : 0;
            cache[1][i] = ('C' == c) ? 1 : 0;
            cache[2][i] = ('G' == c) ? 1 : 0;
            cache[3][i] = ('T' == c) ? 1 : 0;
            
            if (0 < i) {
                cache[0][i] = cache[0][i] + cache[0][i - 1];
                cache[1][i] = cache[1][i] + cache[1][i - 1];
                cache[2][i] = cache[2][i] + cache[2][i - 1];
                cache[3][i] = cache[3][i] + cache[3][i - 1];
            }
        }
        
        for (int i = 0; i < P.length; i++) {
            int[] temp = new int[] {
                cache[0][Q[i]] - (P[i] == 0 ? 0 : cache[0][P[i] - 1]),
                cache[1][Q[i]] - (P[i] == 0 ? 0 : cache[1][P[i] - 1]),
                cache[2][Q[i]] - (P[i] == 0 ? 0 : cache[2][P[i] - 1]),
                cache[3][Q[i]] - (P[i] == 0 ? 0 : cache[3][P[i] - 1]),
                };
            
            if (0 < temp[0]) {
                result[i] = 1;
            } else if (0 < temp[1]) {
                result[i] = 2;
            } else if (0 < temp[2]) {
                result[i] = 3;
            } else if (0 < temp[3]) {
                result[i] = 4;
            }
        }
        
        return result;
    }
}