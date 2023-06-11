import java.util.Scanner;
import java.util.Arrays;

public class ABC {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] abc = {in.nextInt(),in.nextInt(),in.nextInt()};
		Arrays.sort(abc);

		String order = in.next();
		for (int i = 0; i < 3; i++) {
			System.out.print(abc[order.charAt(i)-'A']);
			if (i != 2) System.out.print(" ");
		}
	}
}
