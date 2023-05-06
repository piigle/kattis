import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tests = in.nextInt();
        int[] numbers = new int[tests];

        for (int i = 0; i < tests; i++) {
            numbers[i] = in.nextInt();
        }
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
