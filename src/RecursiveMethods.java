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
        if (b == 0)
            return -1;
        return a*b/MCMReal(a, b);
    }
    public static int MCMReal(int a, int b) {
        if (b == 0) return a;

        return MCMReal(b, a % b);
    }

    public static int sumElements(int[] a) {
        int i = a.length - 1;
        return sumElements(a,i);
    }

    private static int sumElements(int[] a, int i) {
        if(i == 0)
            return 0;

        return a[i] + sumElements(a,i-1);
    }

    public static int biggestIndex(int[] a){
        int i = a.length - 1;
        return biggestIndex(a,i,0);
    }

    private static int biggestIndex(int[] a,int i, int biggest){
        if (i == 0)
            return biggest;
        if (a[i] > biggest)
            biggest = a[i];
        return biggestIndex(a,i-1,biggest);
    }

    public static void reverseArray(int[] a){
        if (a.length == 0){
            throw new RuntimeException("The vector is empty");
        }
        reverseArrayReal(a,0,a.length-1);
    }

    private static void reverseArrayReal(int[] a,int low,int high){
        if (low == high || low > high)
            return;
        int tmp = a[low];
        a[low] = a[high];
        a[high] = tmp;
        reverseArrayReal(a,low+1,high-1);

    }

    public static int indexEqualsValue(int[] a){
        int i = a.length - 1;
        return indexEqualsValueReal(a,i);
    }

    private static int indexEqualsValueReal(int[] a,int i){
        if (i == -1)
            return -1;
        if (a[i] == i)
            return i;
        return indexEqualsValueReal(a,i-1);
    }
}
