import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];


        System.out.println("Ingresa 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }


        System.out.println("\nNúmero\tCuadrado\tCubo");
        for (int i = 0; i < 20; i++) {
            int cuadrado = numeros[i] * numeros[i];
            int cubo = numeros[i] * numeros[i] * numeros[i];
            System.out.println(numeros[i] + "\t" + cuadrado + "\t\t" + cubo);
        }

        scanner.close();
    }
}
