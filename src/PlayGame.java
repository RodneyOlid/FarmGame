import java.util.*;
public class PlayGame {
    static String farmName, playerName;
    static int days = 1, animalTotal, plantTotal, choice, choice2, choice3;
    static double gold = 100;
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
        System.out.println("\nWelcome to " + farmName);
        do{
            while(choice != 1) {
                animalTotal = countArrays.arrayAmt(animalsObjects);
                plantTotal = countArrays.arrayAmt(plantsObjects);
                System.out.println("");
                System.out.println("Day: " + days);
                System.out.println("Gold: " + gold);
                System.out.println("Animals: " + animalTotal);
                System.out.println("Plants: " + plantTotal);
                System.out.println("What would you like to do today?");
                System.out.println("1.Next day \n2.Check animals \n3.Check Plants \n4.Go to the market");
                choice = inputs.nextInt();
                if (choice == 2) {
                    /* print out list of animals and details */
                    for (int i = 0; i < animalsObjects.length - 1; i++) {
                        if (animalsObjects[i] == null) {
                            continue;
                        }
                        System.out.println(i + 1);
                        animalsObjects[i].printAnimalInfo();
                    }
                    System.out.println("\nWould you like to \n1.Feed your animals\n2.Sell them\n3.Go Back");
                    choice2 = inputs.nextInt();
                    if (choice2 == 1) {
                        System.out.println("You feed all your animals and they are happier now. \n");

                    } else if (choice2 == 2){
                        System.out.println("Which one would you like to sell: ");
                        choice3 = inputs.nextInt();
                        gold += sellStuff.sellAnimal(animalsObjects, choice3);
                        animalsObjects = sellStuff.updateAnimalArray(animalsObjects, choice3);
                    } else if (choice2 == 3){
                        choice = 0;
                    }
                } else if (choice == 3) {
                    /* prints out list of plants and details */
                    for (int i = 0; i < plantsObjects.length - 1; i++) {
                        if (plantsObjects[i] == null) {
                            continue;
                        }
                        System.out.println(i + 1);
                        plantsObjects[i].printPlantInfo();
                    }
                    System.out.println("\nWould you like to \n1.Water you plants\n2.Sell them\n3.Go Back");
                    choice2 = inputs.nextInt();
                    if (choice2 == 1) {
                        System.out.println("You watered all your plants.\n");

                    } else if (choice2 == 2){
                        System.out.println("Which one would you like to sell: ");
                        choice3 = inputs.nextInt();
                        gold += sellStuff.sellPlant(plantsObjects, choice3);
                        plantsObjects = sellStuff.updatePlantArray(plantsObjects, choice3);
                    } else if (choice2 == 3){
                        choice = 0;
                    }
                } else if(choice == 4) {
                    /* market code */
                    System.out.println("You go to the market\n");
                    System.out.println("What would you like to buy?\n1.Plants\n2.Animals\n3.Go Back");
                    choice2 = inputs.nextInt();
                    if(choice2 == 1){
                        /* plant  shop code */
                        gold -= Shop.buyPlant(plantsObjects, plantTotal, days);
                    }else if(choice2 == 2){
                        /* animal shop code */
                        gold -= Shop.buyAnimal(animalsObjects, animalTotal, days);
                    } else if(choice2 == 3){
                        choice = 0;
                    }
                }
            }
            System.out.println("ZZZzzz \n");
            days++;
            choice = 0;
            choice2 = 0;
            choice3 = 0;
            for(int i = 0; i < plantTotal; i++){
                plantsObjects[i].updateValues();
            }
        }while(gold < 1000);
        System.out.println("Congrats! You finally paid back the $1000 in a total of " + days + ". You continue your" +
                "farming adventure for the rest of your life.");
        System.out.println("GAME OVER!");
    }
}
