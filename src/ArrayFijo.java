import java.util.Scanner;

public class ArrayFijo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine();

        String[] randomArray = new String[arraySize];

        for (int i=0; i < arraySize; i++) {
            System.out.println("Introduce un elemento para la posición " + (i+1) + ": ");
            randomArray[i] = scanner.nextLine();
        }

        System.out.println("Contenido del array:");
        for (String item : randomArray) {
            System.out.println(item);
        }

        scanner.close();
    }
}
