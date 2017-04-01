package edu.mirea;

public class App {
    static int getMaxProduct(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int a = 0; a < numbers.length; a++) {
            for (int b = a + 1; b < numbers.length; b++) {
                for (int c = b + 1; c < numbers.length; c++) {
                    int buf = numbers[a] * numbers[b] * numbers[c];
                    if (buf > max) {
                        max = buf;
                    }
                }
            }
        }
        return max;
    }

    static boolean areAllNegatives(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                if (i <= numbers.length) {
                    return false;
                }
            }
        }
        return true;
    }
}