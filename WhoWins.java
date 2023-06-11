import java.util.*;

public class WhoWins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Character> state = new ArrayList<>();


        for (int i = 0; i < 9; i++) {
            state.add(in.next().charAt(0));
        }

        boolean win = false;
        char check = 'X';
        for (int j = 0; j < 2; j++) {
            if (win) break;
            else if (j == 1) check = 'O';
            for (int i = 0; i < 7; i++) {
                if (i==0) {
                    if (state.get(0) == check && state.get(1) == check && state.get(2) == check) win = true;
                    if (state.get(0) == check && state.get(3) == check && state.get(6) == check) win = true;
                    if (state.get(0) == check && state.get(4) == check && state.get(8) == check) win = true;
                }
    
                if (i==1) {
                    if (state.get(1) == check && state.get(4) == check && state.get(7) == check) win = true;
                }
    
                if (i==2) {
                    if (state.get(2) == check && state.get(5) == check && state.get(8) == check) win = true;
                    if (state.get(2) == check && state.get(4) == check && state.get(6) == check) win = true;
                }    
                   
                if (i==3) {
                    if (state.get(3) == check && state.get(4) == check && state.get(5) == check) win = true;
                }
    
                if (i==6) {
                    if (state.get(6) == check && state.get(7) == check && state.get(8) == check) win = true;
                }
    
                if (win == true) break;
            }
        }
        

        if (win) {
            System.out.println((check == 'O' ? "Abdullah" : "Johan") + " har vunnit");
        } else {
            System.out.println("ingen har vunnit");
        }

    }
}
