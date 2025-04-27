import java.util.Random;
import java.util.Scanner;

public class VacacionesIbiza {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] personas = { "Luís", "Marcos", "María", "Sofía", "Pedro", "Berta" };
        boolean[] personasPremiadas = new boolean[personas.length];

        int totalPremiados = 0;

        while (totalPremiados < personas.length){
            System.out.print("¿Quieres seleccionar un ganador? (S/N): ");
            String respuesta = scanner.nextLine().toUpperCase();

            if (respuesta.equals("N")){
                break;
            } else if (respuesta.equals("S")){
                int seleccionado;
                do {
                    seleccionado = random.nextInt(personas.length);
                } while (personasPremiadas[seleccionado]);

                System.out.println("El ganador es: " + personas[seleccionado]);
                personasPremiadas[seleccionado] = true;
                totalPremiados++;
            } else {
                System.out.println("Caracter no reconocido. Por favor, escribe S o N.");
            }
        }

        if (totalPremiados == personas.length) {
            System.out.println("Todos los participantes han sido premiados.");
        }

        scanner.close();
    }
}
