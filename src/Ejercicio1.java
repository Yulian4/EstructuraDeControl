import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int opcMenu = 0;
		int opcMenuTipico = 0;
		int opcMenuCarta = 0;
		int opcPlatoInt = 0;
		int contarPlatos = 0;
		int contarPlatosTip = 0;
		int contarPlatosCar = 0;
		int contarPlatosInt = 0;
		int valorPago = 0;
		String nombre;

		String menu = "\n-----Bienvenido al menu-----\n\n";
		menu += "1. Plato tipico\n";
		menu += "2. Plato a la carta\n";
		menu += "3. Plato internacional\n";
		menu += "4. Salir\n\n";
		menu += "Ingrese una opción\n";

		String menuTipico = "\n--Menu Tipico--\n\n";
		menuTipico += "1. Frijoles\n";
		menuTipico += "2. Sopa de verduras\n";
		menuTipico += "3. Regresar\n\n";
		menuTipico += "Ingrese una opción\n";

		String platoCarta = "\n--Plato a la carta--\n\n";
		platoCarta += "1. Carne asada\n";
		platoCarta += "2. Arroz con pollo\n";
		platoCarta += "3. Regresar\n\n";
		platoCarta += "Ingrese una opción\n";

		String platoInt = "\n--Plato Internacional--\n\n";
		platoInt += "1. Plato Español\n";
		platoInt += "2. Plato Mexicano\n";
		platoInt += "3. Regresar\n\n";
		platoInt += "Ingrese una opción\n";

		System.out.println("Queremos saber más de ti\n¿Cuál es tu nombre?");
		nombre = input.next();

		do {
			System.out.println(menu);
			opcMenu = input.nextInt();

			switch (opcMenu) {
				case 1:
					do {
						System.out.println(menuTipico);
						opcMenuTipico = input.nextInt();
						switch (opcMenuTipico) {
							case 1:
								System.out.println("\nHas solicitado Frijoles. Precio: $15000\n");
								contarPlatos++;
								contarPlatosTip++;
								valorPago += 15000;
								break;
							case 2:
								System.out.println("\nHas solicitado Sopa de Verduras. Precio: $15000\n");
								contarPlatos++;
								contarPlatosTip++;
								valorPago += 15000;
								break;
							case 3:
								break;
							default:
								System.out.println("Opción no válida");
								break;
						}
					} while (opcMenuTipico != 3);
					break;

				case 2:
					do {
						System.out.println(platoCarta);
						opcMenuCarta = input.nextInt();
						switch (opcMenuCarta) {
							case 1:
								System.out.println("\nHas solicitado Carne asada. Precio: $15000\n");
								contarPlatos++;
								contarPlatosCar++;
								valorPago += 15000;
								break;
							case 2:
								System.out.println("\nHas solicitado Arroz con pollo. Precio: $15000\n");
								contarPlatos++;
								contarPlatosCar++;
								valorPago += 15000;
								break;
							case 3:
								break;
							default:
								System.out.println("Opción no válida");
								break;
						}
					} while (opcMenuCarta != 3);
					break;

				case 3:
					do {
						System.out.println(platoInt);
						opcPlatoInt = input.nextInt();
						switch (opcPlatoInt) {
							case 1:
								System.out.println("\nHas solicitado Plato Español. Precio: $15000\n");
								contarPlatos++;
								contarPlatosInt++;
								valorPago += 15000;
								break;
							case 2:
								System.out.println("\nHas solicitado Plato Mexicano. Precio: $15000\n");
								contarPlatos++;
								contarPlatosInt++;
								valorPago += 15000;
								break;
							case 3:
								break;
							default:
								System.out.println("Opción no válida");
								break;
						}
					} while (opcPlatoInt != 3);
					break;

				case 4:
					break;
				default:
					System.out.println("Opción ingresada no válida");
					break;
			}
		} while (opcMenu != 4);

		String mensaje = "--Tu factura--\n";
		mensaje += "La cantidad de platos adquiridos fue: " + contarPlatos + "\n";
		mensaje += "Los platos típicos adquiridos: " + contarPlatosTip + "\n";
		mensaje += "Los platos a la carta adquiridos: " + contarPlatosCar + "\n";
		mensaje += "Los platos internacionales adquiridos: " + contarPlatosInt + "\n";
		mensaje += "El valor total a pagar es: $" + valorPago + "\n";
		mensaje += "--Gracias " + nombre + " por hacer parte de nuestra maravillosa familia--";

		System.out.println(mensaje);

		input.close();

	}

}
