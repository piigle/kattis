// Triolingo Push on open.kattis.com
// Note: This solution does not pass all testcases, I am fine with it though as I still acquired 99% of the points with this

import java.util.*;

public class TriolingoPush {
    public static int nthFibMod109plus7(long n) {
        int x = 0;
        int y = 1;
        int z = 1;
        for (long i = 0; i < (n-1); i++) {
            z = (x + y) % ((int)Math.pow(10, 9) + 7);
            x = y;
            y = z;
        }

        return z;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println((nthFibMod109plus7((in.nextLong()+2) % ((int)Math.pow(10, 9) + 7))-1) % ((int)Math.pow(10, 9) + 7));
    }
}
