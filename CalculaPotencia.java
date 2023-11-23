import java.util.Scanner;
public class CalculaPotencia {

	public static void main(String[] args) {
		double p;
		Scanner base;
		Scanner exp;
		int b;
		double e;
		base=new Scanner(System.in);
		System.out.println("Introduce una base: ");
		b=base.nextInt();
		exp=new Scanner(System.in);
		System.out.println("Introduce un exponente: ");
		e=exp.nextDouble();
		if (e<0) {
			p=1/(Math.pow(b,Math.abs(e)));
			System.out.printf("Tu numero %d elevado a %.0f es %.2f", b,e,p);
		}
		else {
			p=Math.pow(b,e);
			System.out.printf("Tu numero %d elevado a %.0f es %.2f", b,e,p);
		}	
		base.close();
		exp.close(); 
	}

}
 