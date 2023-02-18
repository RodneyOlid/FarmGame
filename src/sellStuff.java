import java.util.*;
// By Rodney Olid
public class sellStuff {
    // Sells the animal or plant chosen and gives a random bonus
    public static double sellAnimal(Animals [] animalsArray, int place){
        Random rand = new Random();
        double gold;
        int bonus;
        System.out.println("You sold " + animalsArray[place - 1].name + " for " + animalsArray[place - 1].value);
        bonus = rand.nextInt(50);
        System.out.println("You got an extra " + bonus + "!");
        gold = animalsArray[place - 1].value + bonus;

        return gold;
    }
    public static double sellPlant(Plants [] plantsArray, int place){
        double gold;
        int bonus;
        Random rand = new Random();
        bonus = rand.nextInt(50);
        System.out.println("You sold " + plantsArray[place - 1].type + " for " + plantsArray[place - 1].value);
        System.out.println("You got an extra " + bonus + "!");
        gold = plantsArray[place - 1].value + bonus;

        return gold;
    }
    // Takes the array and removes the sold animal or plant. Returns the array
    public static Animals[] updateAnimalArray(Animals [] animalsArray, int position){
        Animals[] myArray = new Animals[animalsArray.length - 1];
        for(int x = 0, y = 0;  x < animalsArray.length; x++){
            if (x == position - 1){
                continue;
            }
            myArray[y++] = animalsArray[x];
        }
        return myArray;
    }
    public static Plants[] updatePlantArray(Plants [] plantsArray, int position){
        Plants[] myArray = new Plants[plantsArray.length - 1];
        for(int x = 0, y = 0;  x < plantsArray.length; x++){
            if (x == position - 1){
                continue;
            }
            myArray[y++] = plantsArray[x];
        }
        return myArray;
    }

}
