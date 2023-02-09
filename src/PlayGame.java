import java.util.*;
public class PlayGame {
    static String farmName, playerName;
    static int days = 1, animalTotal, plantTotal, choice;
    static double money = 100;
    static Animals [] animalsObjects = new Animals[10];
    static Plants [] plantsObjects = new Plants [10];
    static Scanner inputs = new Scanner(System.in);

    public static void start(){
        System.out.println("Hey you're a new face around here! What's your name? ");
        playerName = inputs.next();
        System.out.println("So you're name is " + playerName + ". Nice to meet you!");
        System.out.println("""
                ...
                I see, you wanna be a farmer huh. Well, I can sell you a plot of land for $1000, just make sure to
                pay me back as soon as you can.
                What are you going to name your farm?
                """);
        farmName = inputs.next();
        System.out.print(farmName);
        System.out.print("""
                 that's a good name. Well I run the market around here. So if you need anything for you're farm
                 come on by and I'll sell you anything you need.
                """);
        System.out.println("Welcome to " + farmName);
        do{
            System.out.println("Day " + days);
            System.out.println("Animals " + animalTotal);
            System.out.println("Plants " + plantTotal);
            System.out.println("What would you like to do today?");
            System.out.println("1. Next day \n2. Check animals \n3. Check Plants \n4. Go to the market");
            choice = inputs.nextInt();
            if (choice == 1){
                System.out.println("ZZZzzz");
                days++;
            }
        }while(money < 1000);
        System.out.println("Congrats! You finally paid back the $1000 in a total of " + days + ". You continue your" +
                "farming adventure for the rest of your life.");
        System.out.println("GAME OVER!");
    }
}
