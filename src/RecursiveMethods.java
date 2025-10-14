public final class RecursiveMethods {
    public static int multiplication(int a, int b) {
        int result = -1;
        if (a <= 0 || b <= 0)
            return result;
        if (a < b)
            result = realMultiplication(b, a, 0);
        else
            result = realMultiplication(a, b, 0);
        return result;
    }

    private static int realMultiplication(int a, int b, int c) {
        if (b == 0)
            return c;
        b--;
        c += a;
        return realMultiplication(a, b, c);
    }

    public static int division(int a, int b) {
        if (b == 0 || b > a)
            return -1;
        return realDivision(a, b, 0);
    }

    private static int realDivision(int a, int b, int c) {
        if (a == 0)
            return c;
        a -= b;
        c++;
        return realDivision(a, b, c);
    }

    public static int MCM(int a, int b) {
        if (b == 0) return a;

        return MCM(b, a % b);
    }
}
