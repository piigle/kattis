import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class SimpleArithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigDecimal A = new BigDecimal(in.next());
        BigDecimal B = new BigDecimal(in.next());
        BigDecimal C = new BigDecimal(in.next());
        BigDecimal answer = A.multiply(B).divide(C, 18, RoundingMode.HALF_UP);

        System.out.println(answer);
    }
}
