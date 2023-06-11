import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean capping = false;
        int upper_bound = 11;
        int lower_bound = 0;

        while (in.hasNextLine()) {
            int guess = in.nextInt();
            in.nextLine();
            if (guess == 0) break;

            String status_string = in.nextLine();
            switch (status_string) {
                case "too high":
                    if (guess < upper_bound)
                        upper_bound = guess;
                    break;
                case "too low":
                    if (guess > lower_bound)
                        lower_bound = guess;
                    break;
                case "right on":
                    if (!(guess < upper_bound && guess > lower_bound))
                        capping = true;
                    System.out.print(capping ? "\nStan is dishonest" : "\nStan may be honest");
                    capping = false;
                    lower_bound = 0;
                    upper_bound = 11;
                    break;
            }

            if (lower_bound > upper_bound) capping = true;
        }
        System.out.print("\n");
    }
}