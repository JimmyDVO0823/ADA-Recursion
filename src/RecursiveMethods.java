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
        return a * b / MCMReal(a, b);
    }

    public static int MCMReal(int a, int b) {
        if (b == 0) return a;

        return MCMReal(b, a % b);
    }

    public static int sumElements(int[] a) {
        int i = a.length - 1;
        return sumElements(a, i);
    }

    private static int sumElements(int[] a, int i) {
        if (i == 0)
            return 0;

        return a[i] + sumElements(a, i - 1);
    }

    public static int biggestIndex(int[] a) {
        int i = a.length - 1;
        return biggestIndex(a, i, 0, -1);
    }

    private static int biggestIndex(int[] a, int i, int biggest, int biggestIndex) {
        if (i == 0)
            return biggestIndex;
        if (a[i] > biggest) {
            biggest = a[i];
            biggestIndex = i;

        }
        return biggestIndex(a, i - 1, biggest, biggestIndex);
    }

    public static void reverseArray(int[] a) {
        if (a.length == 0) {
            throw new RuntimeException("The vector is empty");
        }
        reverseArrayReal(a, 0, a.length - 1);
    }

    private static void reverseArrayReal(int[] a, int low, int high) {
        if (low == high || low > high)
            return;
        int tmp = a[low];
        a[low] = a[high];
        a[high] = tmp;
        reverseArrayReal(a, low + 1, high - 1);

    }

    public static int indexEqualsValue(int[] a) {
        int i = a.length - 1;
        return indexEqualsValueReal(a, i);
    }

    private static int indexEqualsValueReal(int[] a, int i) {
        if (i == -1)
            return -1;
        if (a[i] == i)
            return i;
        return indexEqualsValueReal(a, i - 1);
    }

    //Comienzan los metodos del punto 4E
    public static int[] interseccion(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new RuntimeException("Error");
        }
        int tamanio = 0;
        if (a.length < b.length) {
            tamanio = tamanioInt(b, a, 0, 0);
        } else {
            tamanio = tamanioInt(a, b, 0, 0);
        }
        if (tamanio == 0) {
            return null;
        }
        int[] resultado = new int[tamanio];
        return interseccion(a, b, 0, 0, resultado);
    }

    public static int[] interseccion(int[] a, int[] b, int i, int j, int resultado[]) {
        if (i == a.length) {
            return resultado;
        }

        if (contiene2(a[i], b, 0)) {
            resultado[j] = a[i];
            j++;
        }
        return interseccion(a, b, i + 1, j, resultado);
    }

    public static int tamanioInt(int[] a, int[] b, int i, int tamanio) {
        if (i == a.length) {
            return tamanio;
        }
        tamanio += contiene(a[i], b, 0);
        return tamanioInt(a, b, i + 1, tamanio);
    }

    public static int contiene(int a, int[] b, int i) {
        if (i == b.length) {
            return 0;
        }
        if (b[i] == a) {
            return 1;
        }
        return contiene(a, b, i + 1);
    }

    public static boolean contiene2(int a, int[] b, int i) {
        if (i == b.length) {
            return false;
        }
        if (b[i] == a) {
            return true;
        }
        return contiene2(a, b, i + 1);
    }

    //Terminan los metodos del punto 4E

    //Empiezan los metodos para 4F
    public static int[] union(int[] a, int[] b) {
        int length = a.length + b.length;
        int[] result = new int[length - tamanioIntUnion(a, b, 0, 0)];

        System.out.println("length vale " + length);
        unionReal(a, b, result, 0, length, 0);
        return result;

    }

    public static void unionReal(int[] a, int[] b, int[] result, int i, int length, int correction) {

        System.out.println(i);
        if (i == length) {
            return;
        }

        if (i < a.length) {
            result[i] = a[i];
        } else {
            if (!contieneUnion2(b[i - a.length], result, 0)) {
                result[i - correction] = b[i - a.length];
            } else
                correction++;
        }
        unionReal(a, b, result, i + 1, length, correction);
    }

    public static int tamanioIntUnion(int[] a, int[] b, int i, int tamanio) {
        if (i == a.length) {
            return tamanio;
        }
        tamanio += contieneUnion(a[i], b, 0);
        return tamanioInt(a, b, i + 1, tamanio);
    }

    public static int contieneUnion(int a, int[] b, int i) {
        if (i == b.length) {
            return 0;
        }
        if (b[i] == a) {
            return 1;
        }
        return contieneUnion(a, b, i + 1);
    }

    public static boolean contieneUnion2(int a, int[] b, int i) {
        if (i == b.length) {
            return false;
        }
        if (b[i] == a) {
            return true;
        }
        return contieneUnion2(a, b, i + 1);
    }

    //Terminan los metodos para 4F

    public static int biggestElement(int[] a) {
        if (a == null || a.length == 0)
            throw new RuntimeException("The vector is empty or null");
        return biggestElementReal(a, 0, a[0]);
    }

    private static int biggestElementReal(int[] a, int i, int biggest) {
        if (i == a.length)
            return biggest;
        if (a[i] > biggest)
            biggest = a[i];
        return biggestElementReal(a, i + 1, biggest);

    }

    public static int[][] matrixSum(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        return matrixSum(a, b, result, 0, 0);
    }

    private static int[][] matrixSum(int[][] a, int[][] b, int[][] result, int i, int j) {
        if (j == a[0].length) {
            j = 0;
            i++;
        }

        if (i == a.length) {
            return result;
        }

        result[i][j] = a[i][j] + b[i][j];

        return matrixSum(a, b, result, i, j + 1);
    }

    public static int[][] matrixSubtract(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        return matrixSubtract(a, b, result, 0, 0);
    }

    private static int[][] matrixSubtract(int[][] a, int[][] b, int[][] result, int i, int j) {
        if (j == a[0].length) {
            j = 0;
            i++;
        }
        if (i == a.length) {
            return result;
        }
        result[i][j] = a[i][j] - b[i][j];
        return matrixSubtract(a, b, result, i, j + 1);
    }

    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        return matrixMultiplyReal(a, b, result, 0, 0);
    }

    private static int[][] matrixMultiplyReal(int[][] a, int[][] b, int[][] result, int i, int j) {
        if (j == a[0].length) {
            j = 0;
            i++;
        }

        if (i == a.length) {
            return result;
        }

        result[i][j] = a[i][j] * b[i][j];
        return matrixMultiplyReal(a, b, result, i, j + 1);
    }

    public static int maxMatrix(int[][] a) {
        int i = Integer.MIN_VALUE;
        return maxMatrix(a, i, 0, 0);
    }

    private static int maxMatrix(int[][] a, int max, int i, int j) {
        if (j == a[0].length) {
            j = 0;
            i++;
        }
        if (i == a.length) {
            return max;
        }
        if (max < a[i][j]) {
            max = a[i][j];
        }
        return maxMatrix(a, max, i, j + 1);
    }

    public static String mostZeros(int[][] a) {
        if (a == null || a.length == 0)
            throw new RuntimeException("The vector is empty or null");
        int[] memory = new int[a.length];
        return mostZerosReal(a, "", 0, memory);
    }

    private static String mostZerosReal(int[][] a, String result, int i, int[] memory) {
        if (i == a.length) {
            for (int j = 0; j < memory.length; j++) {

            }
            return result;
        }
        int tmp = 0;
        for (int j = 0; j < a[0].length; j++) {
            if (a[i][j] == 0) {
                tmp++;
            }
        }
        memory[i] = tmp;

        return mostZerosReal(a, result, i + 1, memory);


    }
}
//< >
