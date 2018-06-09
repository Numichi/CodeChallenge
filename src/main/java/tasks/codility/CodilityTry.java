package tasks.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CodilityTry {
    int solution(int[] A) {
        List<Integer> list = new ArrayList<>();

        for (int i : A) {
            if(0 < i && !list.contains(i)) {
                list.add(Math.abs(i));
            }
        }

        if(list.size() == 0) {
            return 1;
        }

        Collections.sort(list);

        int max = list.get(list.size() - 1);

        for(int i = list.size() - 1; i > 0; i--) {
            if(max != list.get(i)) {
                return max;
            }
            max--;
        }

        return list.get(list.size() - 1) + 1;
    }
}
