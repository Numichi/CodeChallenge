package tasks.hackerrank.crackingTheCodingInterview;

class ArrayLeftRotation {
    int[] rotLeft(
        int[] a,
        int d
    ) {
        if (1 < d || 0 < d % a.length) {
            d = d % a.length;
            int poz = 0;
            int[] temp = new int[] {a[0], 0};
            do {
                int newPoz = Math.floorMod(poz - d, a.length);
                temp[1] = a[newPoz];
                a[newPoz] = temp[0];
                temp[0] = temp[1];
                poz = newPoz;
            } while (poz != 0);
        }
        
        return a;
    }
}
