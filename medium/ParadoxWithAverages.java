import java.util.Scanner;

public class ParadoxWithAverages {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         int numTestcases = in.nextInt();
         in.nextLine();
         for (int p = 0; p < numTestcases; p++) {
             in.nextLine();

             int cs = in.nextInt();
             int[] cs_students = new int[cs];
             int econ = in.nextInt();

             double cs_average = 0.0;
             double econ_average = 0.0;

             for (int i = 0; i < cs; i++) {
                 int curIQ = in.nextInt();
                 cs_average += (double)curIQ;
                 cs_students[i] = curIQ;
             }
             for (int i = 0; i < econ; i++) {
                 econ_average += (double)in.nextInt();
             }
             cs_average /= cs;
             econ_average /= econ;

             int funny = 0;
             for (int stu : cs_students) {
                 if ((double)stu < cs_average && (double)stu > econ_average)
                     funny++;
             }
             System.out.println(funny);
         }

    }
}
