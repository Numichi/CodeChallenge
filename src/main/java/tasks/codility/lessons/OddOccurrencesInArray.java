package tasks.codility.lessons;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Detected time complexity:
 * O(N) or O(N*log(N))
 */
class OddOccurrencesInArray {
    int solution(int[] A) {
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int i : A) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                set.remove(i);
            }
        }
        
        return set.iterator().next();
    }
}
