import java.util.Scanner;

public class RestaSimple {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		//PIDE PRIMER NUMERO
		System.out.println("Introduce un numero:");
		int num=sc.nextInt();
		//PIDE SEGUNDO NUMERO
		System.out.println("Introduce el segundo:");
		int num2=sc.nextInt();
		if (num==num2) {
			System.out.println("Los dos numeros introducidos son iguales.");
		}
		else if (num>num2) {
			System.out.printf("La resta es: %d", num-num2);
		}
		else System.out.printf("La resta es: %d", num2-num);
		sc.close();
	}

}
