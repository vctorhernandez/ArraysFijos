import java.util.Arrays;

public class ParImpar {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int nPares = 0;
        int nImpares = 0;

        for (int num: numeros) {
            if (num % 2 == 0) {
                nPares++;
            } else {

                nImpares++;
            }
        }

        System.out.println("Se han encontrado: " + nPares + " números pares y " + nImpares + " números impares.");

        int[] numerosPares = new int[nPares];
        int[] numerosImpares = new int[nImpares];

        int iPares = 0;
        int iImpares = 0;

        for (int num: numeros) {
            if (num % 2 == 0) {
                numerosPares[iPares] = num;
                iPares++;
            } else {
                numerosImpares[iImpares] = num;
                iImpares++;
            }
        }

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array pares: " + Arrays.toString(numerosPares));
        System.out.println("Array impares: " + Arrays.toString(numerosImpares));
    }
}
