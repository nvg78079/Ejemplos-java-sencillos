import java.util.Scanner;

public class CalculadoraEuros {

	public static void main(String[] args) {
		
		final double C=166.386;
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame la cantidad de pesetas que quieres cambiar: ");
		double n=teclado.nextDouble();
		if (n<0) {
			System.out.println("El valor en pesetas establecido no es valido.");
		}
		else System.out.printf("Tu dinero en Euros serian: %.2f",n*C);
		teclado.close();
	}
	// Aqui añadimos este comentario para ver si se actualiza correctamente el contenido
	// Rezemos para que todo salga bien
}
