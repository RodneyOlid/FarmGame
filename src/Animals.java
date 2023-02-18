// By Rodney Olid
public class Animals {
    public String name;
    private String type;
    public int age, value, place;
    public static final String[] animalsArray = {"Pig", "Cow", "Goat", "Chicken", "Sheep", "Horse", "Dog", "Rabbit"};
    public static final int [][] animalValues = {{10, 40}, {25, 80}, {5, 50}, {5, 15}, {10, 20}, {15, 40}, {5, 15}, {5, 10}};
    public Animals(){
    }
    public Animals(String animalName, int animalPlace, int animalValue){
        name = animalName;
        age = 1;
        value = animalValue;
        type = animalsArray[animalPlace];
        place = animalPlace;
    }
    // updates the animals value util it reaches its maximum value
    public void updateAnimalValues(){
        while(this.value < animalValues[this.place][1]) {
            this.value += 5;
        }
    }
    public void printAnimalInfo(){
        System.out.println("Animal: " + this.getType());
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Value: " + this.getValue() + "gold");
    }
    public static String printArray(int place){
        return animalsArray[place];
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getValue(){ return this.value;}
    public String  getType(){ return this.type;}

}

