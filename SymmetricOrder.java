import java.util.*;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int counter = 1;
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;
            ArrayList<String> set = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                set.add((int)Math.ceil(set.size()/2.0), in.next());
            }

            System.out.printf("SET %d\n", counter);
            for (String s : set) {
                System.out.println(s);
            }
            
            counter++;
        }
    }
}