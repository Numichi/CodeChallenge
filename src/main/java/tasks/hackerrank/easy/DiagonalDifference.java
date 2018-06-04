package tasks.hackerrank.easy;

import exception.NotSquareMatrixException;

class DiagonalDifference {
    int diagonalDifference(int[][] a) throws NotSquareMatrixException {
        if(a == null) {
            throw new NullPointerException();
        }

        int first = 0;
        int second = 0;

        for(int i = 0; i < a.length; i++) {
            if(a.length != a[i].length) {
                throw new NotSquareMatrixException();
            }

            first += a[i][i];
            second += a[i][a.length - 1 - i];
        }

        return Math.abs(first - second);
    }
}
