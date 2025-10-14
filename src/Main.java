import java.util.Scanner;

public class Main {
    static void main() {
        //mainMultiplication();
        //mainDivision();
        //mainMCM();
    }

    static void mainMultiplication(){
        System.out.println("Vamos a multiplicar");
        System.out.println("Ingrese el primer numero");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = sc.nextInt();
        System.out.println("El resultado es: " + RecursiveMethods.multiplication(a, b));
        sc.close();
    }

    static void mainDivision(){
        System.out.println("Vamos a dividir");
        System.out.println("Ingrese el primer numero");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = sc.nextInt();
        System.out.println("El resultado es: " + RecursiveMethods.division(a, b));
        sc.close();
    }

    static void mainMCM(){
        System.out.println("Vamos a hallar el MCM de dos números");
        System.out.println("Ingrese el primer numero");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = sc.nextInt();
        System.out.println("El MCM es: " + RecursiveMethods.MCM(a,b));
        sc.close();
    }
}
