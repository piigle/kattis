import java.util.*;
public class DiscDistrict {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long radius = in.nextLong();

        double minDistance = -1.0;
        long min_x = 0;
        long min_y = 0;

        for (long x = 0; x <= radius; x++) {
            long y = (long)Math.ceil(Math.sqrt(radius * radius - x * x) + 0.000001);
            double distance = Math.sqrt(x * x + y * y);
            if ((minDistance == -1.0 || Double.compare(distance, minDistance) < 0) && Double.compare(distance, (double)(radius)) > 0) {
                min_x = x;
                min_y = y;
                minDistance = distance;
            }
        }

        System.out.printf("%d %d\n", min_x, min_y);
    }
}