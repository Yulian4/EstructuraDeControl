import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int sueldoBas = 0;
        int categoria = 0;
        String mensaje;
        int pago = 0;
        double descuento = 0;
        double bonificacion = 0;

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese su sueldo básico: ");
        sueldoBas = scanner.nextInt();

        mensaje = "Elija el número de su categoría:\n";
        mensaje += "1. Categoría 1\n";
        mensaje += "2. Categoría 2\n";
        mensaje += "3. Categoría 3\n";
        mensaje += "4. Categoría 4\n";
        mensaje += "5. Salir\n";

        do {
            System.out.println(mensaje);
            categoria = scanner.nextInt();

            switch (categoria) {
                case 1:
                    bonificacion = sueldoBas * 0.15;
                    descuento = sueldoBas * 0.02;
                    break;
                case 2:
                    bonificacion = sueldoBas * 0.10;
                    descuento = sueldoBas * 0.015;
                    break;
                case 3:
                    bonificacion = sueldoBas * 0.08;
                    descuento = sueldoBas * 0.01;
                    break;
                case 4:
                    bonificacion = 0;
                    descuento = 0;
                    break;
                case 5:
                    System.out.println("Gracias por tu atención.");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (categoria != 5);

        if (categoria >= 1 && categoria <= 4) {
            pago = (int) (sueldoBas + bonificacion - descuento);

            System.out.println("\nSeñor/a " + nombre +
                               "\nSu categoría es: " + categoria +
                               "\nSu bonificación es: " + bonificacion +
                               "\nSu descuento es: " + descuento +
                               "\nSu pago total es: " + pago +
                               "\nGracias por hacer cálculos con nosotros.");
        }
    }
}
