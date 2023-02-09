import java.util.*;
public class GameMenu {
    public static void start() {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        while (choice != 3) {
            System.out.println("Welcome to *Farm Game*");
            System.out.println("1. Start\n2. Rules\n3. Quit");
            choice = input.nextInt();
            if (choice == 1) {
                /* start game code */
                PlayGame.start();
            } else if (choice == 2) {
                System.out.println("""
                        Your goal to reach a total profit of *$1000* the fastest you can. You can do that by
                        growing plants and animals, then selling them at the market. You can also buy items you may need at
                        the market as well.""");
                System.out.println("");
                choice = 0;
            }
        }
        System.out.println("Thanks for playing!");
    }
}
