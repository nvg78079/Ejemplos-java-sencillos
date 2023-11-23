import java.util.Random;
public class NumeroRandom {

	public static void main(String[] args) {
		Random rd;
		rd=new Random();
		int numRandom = 5 + rd.nextInt(10);
		System.out.printf("%d", numRandom);

	}

}
