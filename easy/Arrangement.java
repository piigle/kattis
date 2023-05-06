import java.util.Scanner;
import java.util.Arrays;

public class Arrangement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int room_count = in.nextInt();
        int team_count = in.nextInt();

        int[] rooms = new int[room_count];
        Arrays.fill(rooms, 0);

        while (team_count > 0) {
            for (int i = 0; team_count > 0 && i < room_count; i++) {
                rooms[i]++;
                team_count--;
            }
        }

        for (int i = 0; i < rooms.length; i++) {
            System.out.println("*".repeat(rooms[i]));
        }
    }
}
