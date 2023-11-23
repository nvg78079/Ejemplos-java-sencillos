  import java.util.Scanner;
public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int n=sc.nextInt();
		int i=1;
		System.out.printf("La tabla de multiplicar del %d\n", n);
		while (i<11) {
			System.out.printf("El numero %d por el %d es %d\n",n,i,n*i);
			i+=1;
		sc.close();
		}

	}

}
