import java.util.Scanner;

public class AreaFigura {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido al calculador de C!reas");

		System.out.println("1. Calcular C!rea de un rectC!ngulo");
		System.out.println("2. Calcular C!rea de un cC-rculo");
		System.out.println("Ingrese su opciC3n:");
		int opcion = scanner.nextInt();

		if (opcion == 1) {
			System.out.println("Ingrese la base del rectC!ngulo: ");
			double base = scanner.nextDouble();
			System.out.println("Ingrese la altura del rectC!ngulo: ");
			double altura = scanner.nextDouble();

			double area = base * altura;
			System.out.println("El C!rea del rectC!ngulo es " + area); 
		} else if (opcion == 2) {
			System.out.println("Ingrese el radio del cC-rculo: ");
			double radio = scanner.nextDouble();

			double area = 3.1416 * Math.pow(radio,2);
			System.out.println("El C!rea del cC-rculo es: " + area);
		} else {
			System.out.println("B!OpciC3n invC!lida!");
		}
		scanner.close();
	}
}
