// By Isabella Laditi
import java.util.*;
public class Seasons {
    private int month, day;
    public static void printSeason(int month, int day){
        switch(month){
            case 1:
            case 2:
                System.out.println("\nWinter");
                break;
            case 4:
            case 5:
                System.out.println("\nSpring");
                break;
            case 7:
            case 8:
                System.out.println("\nSummer");
                break;
            case 10:
            case 11:
                System.out.println("\nFall");
                break;

            //inconlusive months
            case 3:
            case 6:
            case 9:
            case 12:
                //The first half the months are typically the same as the previous months, and the second half equals the same season as the next month.
                boolean beginningHalf = day <= 15;
                int adjacentMonths = month + (beginningHalf ? 1 : -1 );
                printSeason(adjacentMonths, day);
        }

    }
}

