import java.util.*;

public class Faktor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int articles = in.nextInt();
        int impact = in.nextInt();

        System.out.println((impact - 1) * articles + 1);
    }
}
