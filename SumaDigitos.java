import java.util.Scanner;

public class SumaDigitos {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int n=teclado.nextInt();
		int x=0;
		while (n>0) {
			x=x+(n%10);
			n=n/10;
		}
		System.out.printf("La suma de sus digitos es: %d", x);
		teclado.close();
	}

}
