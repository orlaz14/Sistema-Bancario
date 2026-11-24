import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double transferencia;
        int registros = 0;

        while (true) {
            System.out.print("Ingrese transferencia (-1 termina): ");
            transferencia = sc.nextDouble();

            if (transferencia == -1) {
                break;
            }

            registros++;

            if (transferencia > 100000) {
                System.out.println("Transferencia detectada: S/ " + transferencia);
                break;
            }
        }

        System.out.println("Registros procesados: " + registros);

        sc.close();
    }
}