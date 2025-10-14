import java.util.Scanner;

public class Main {
    static void main() {
        //main1();
        //main2();
        //main3();
        //main4A();
        //main4B();
        //main4C();
        //main4D();

    }

    static void main1(){
        System.out.println("Vamos a multiplicar");
        System.out.println("Ingrese el primer numero");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = sc.nextInt();
        System.out.println("El resultado es: " + RecursiveMethods.multiplication(a, b));
        sc.close();
    }

    static void main2(){
        System.out.println("Vamos a dividir");
        System.out.println("Ingrese el primer numero");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = sc.nextInt();
        System.out.println("El resultado es: " + RecursiveMethods.division(a, b));
        sc.close();
    }

    static void main3(){
        System.out.println("Vamos a hallar el MCM de dos números");
        System.out.println("Ingrese el primer numero");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = sc.nextInt();
        System.out.println("El MCM es: " + RecursiveMethods.MCM(a,b));
        sc.close();
    }

    static void main4A(){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("La suma de los numeros del 1 al 10 es " +  RecursiveMethods.sumElements(a));
    }

    static void main4B(){
        int[] a = {1,2,3,4,12,6,7,8,9,10};
        System.out.println("El mayor es " +  RecursiveMethods.biggestIndex(a));
    }

    static void main4C(){
        int[] a = {1,2,3,4,12,6,7,8,9,10,11};
        int len = a.length;
        StringBuilder print = new StringBuilder();
        System.out.println("Array invertido:\n");
        RecursiveMethods.reverseArray(a);
        for (int i = 0; i < len; i++) {
            print.append(a[i]).append(",");
        }
        System.out.println("[" + print + "]");

    }

    static void main4D(){
        int[] a = {4,3,5,1,2,2,10,7,1,2,1,1,1};
        int len = a.length;
        System.out.println("El indice y valor iguales es: " + RecursiveMethods.indexEqualsValue(a));
    }

    static void main4E(){

    }

}
