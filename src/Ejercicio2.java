import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int estrato = 0, valorNomina = 0;
        double porcentaje = 0, nominaActual;
        Scanner input = new Scanner(System.in);

        String estratos = "1. Estratos 1-2\n";
        estratos += "2. Estratos 3-4\n";
        estratos += "3. Estrato 5\n";
        estratos += "4. Estrato 6\n";
        estratos += "5. Salir";

        System.out.print("Digite el valor de su nómina: ");
        valorNomina = input.nextInt();

        System.out.println("¿Cuál es su estrato?\n" + estratos + "\nElija una opción: ");
        estrato = input.nextInt();

        switch (estrato) {
            case 1:
                porcentaje = 0.02;
                System.out.println("Estrato 1-2 tiene un descuento del 2%");
                break;
            case 2:
                porcentaje = 0.04;
                System.out.println("Estrato 3-4 tiene un descuento del 4%");
                break;
            case 3:
                porcentaje = 0.08;
                System.out.println("Estrato 5 tiene un descuento del 8%");
                break;
            case 4:
                porcentaje = 0.10;
                System.out.println("Estrato 6 tiene un descuento del 10%");
                break;
            case 5:
                System.out.println("Gracias por tu atención.");
                return;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        double descuento = valorNomina * porcentaje;
        nominaActual = valorNomina - descuento;

        System.out.println("El valor de su nómina según su estrato queda en: " + nominaActual);
    }
}

