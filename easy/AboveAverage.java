import java.util.Scanner;
import java.util.ArrayList;

public class AboveAverage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	

		int numTests = in.nextInt();
		for (int i = 0; i < numTests; i++) {
			ArrayList<Integer> stuGrades = new ArrayList<>();
			int sum = 0;
			int numStudents = in.nextInt();

			int grade = 0;
			for (int j = 0; j < numStudents; j++) {
				grade = in.nextInt();
				sum += grade;
				stuGrades.add(grade);
			}

			int numAbove = 0;
			double avg = (double)sum / numStudents;
			for (int g : stuGrades) {
				if ((double)g > avg)
					numAbove++;
			}	
			System.out.printf("%.3f%%\n", ((double)numAbove / numStudents) * 100);
		}
	}
}
