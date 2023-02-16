import java.util.*;

public class Shop {
    private int stock;
    private int revenue;
    private static Random rand;

    static Scanner input = new Scanner(System.in);


    public Shop() {
        this.stock = 0;
        this.revenue = 0;
        rand = new Random();
    }

    public void buy(int amount) {
        this.stock += amount;
    }


    public void sell() {
        if (this.stock > 0) {
            int sales = rand.nextInt(this.stock) + 1;
            this.stock -= sales;
            this.revenue += sales;
            System.out.println("Successful sale of " + sales + " items. Current stock: " + this.stock + ", Current revenue: " + this.revenue);
        } else {
            System.out.println("No items in stock. Unable to sell.");
        }
    }
    public static double buyAnimal(Animals [] animalArray, int position, int day){
        int choice;
        double gold;
        int place = 0;
        String name;
        int shop = day % 2;

        System.out.println("Which animal would you like to buy:");
        if(shop == 0) {
            System.out.println("1:" + Animals.printArray(0) + " " + Animals.animalValues[0][0] + "gold");
            System.out.println("2:" + Animals.printArray(2) + " " + Animals.animalValues[2][0] + "gold");
            System.out.println("3:" + Animals.printArray(4) + " " + Animals.animalValues[4][0] + "gold");
            System.out.println("4:" + Animals.printArray(6) + " " + Animals.animalValues[6][0] + "gold");
            choice = input.nextInt();
            if(choice == 1){
                place = 0;
            } else if (choice == 2){
                place = 2;
            } else if (choice == 3){
                place = 4;
            } else if (choice == 4){
                place = 6;
            }
        } else {
            System.out.println("1:" + Animals.printArray(1) + " " + Animals.animalValues[1][0] + "gold");
            System.out.println("2:" + Animals.printArray(3) + " " + Animals.animalValues[3][0] + "gold");
            System.out.println("3:" + Animals.printArray(5) + " " + Animals.animalValues[5][0] + "gold");
            System.out.println("4:" + Animals.printArray(7) + " " + Animals.animalValues[7][0] + "gold");
            choice = input.nextInt();
            if(choice == 1){
                place = 1;
            } else if (choice == 2){
                place = 3;
            } else if (choice == 3){
                place = 5;
            } else if (choice == 4){
                place = 7;
            }
        }
        System.out.println("What would you like to name it? ");
        name = input.next();
        animalArray[position] = new Animals(name, place, Animals.animalValues[place][0]);
        gold = Animals.animalValues[place][0];
        return gold;
    }
    public static double buyPlant(Plants [] plantArray, int position, int day){
        int choice;
        double gold;
        int place = 0;
        int shop = day % 2;

        System.out.println("Which plant would you like to buy:");
        if(shop == 0) {
            System.out.println("1:" + Plants.printArray(0) + " " + Plants.plantValues[0][0] + "gold");
            System.out.println("2:" + Plants.printArray(2) + " " + Plants.plantValues[2][0] + "gold");
            System.out.println("3:" + Plants.printArray(4) + " " + Plants.plantValues[4][0] + "gold");
            System.out.println("4:" + Plants.printArray(6) + " " + Plants.plantValues[6][0] + "gold");
            choice = input.nextInt();
            if(choice == 1){
                place = 0;
            } else if (choice == 2){
                place = 2;
            } else if (choice == 3){
                place = 4;
            } else if (choice == 4){
                place = 6;
            }
        } else {
            System.out.println("1:" + Plants.printArray(1) + " " + Plants.plantValues[1][0] + "gold");
            System.out.println("2:" + Plants.printArray(3) + " " + Plants.plantValues[3][0] + "gold");
            System.out.println("3:" + Plants.printArray(5) + " " + Plants.plantValues[5][0] + "gold");
            System.out.println("4:" + Plants.printArray(7) + " " + Plants.plantValues[7][0] + "gold");
            choice = input.nextInt();
            if(choice == 1){
                place = 1;
            } else if (choice == 2){
                place = 3;
            } else if (choice == 3){
                place = 5;
            } else if (choice == 4){
                place = 7;
            }
        }
        plantArray[position] = new Plants(place, Plants.plantValues[place][0]);
        gold = Plants.plantValues[place][0];
        return gold;
    }

}
