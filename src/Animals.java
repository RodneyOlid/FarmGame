public class Animals {
    String name, type;
    int age, value, place;
    public final String[] animalsArray = {"Pig", "Cow", "Goat", "Chicken", "Sheep", "Horse", "Dog", "Rabbit"};
    public Animals(){
        name = "";
        age = 0;
        value = 0;
    }
    public Animals(String animalName, int animalPlace, int animalValue){
        name = animalName;
        age = 1;
        value = animalValue;
        type = animalsArray[animalPlace];
    }
    public void printAnimalInfo(){
        System.out.println("Animal: " + this.getType());
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Value: " + this.getValue());
    }
    public int sellAnimal(Animals [] animalsArray, int place){
        int gold;
        gold = animalsArray[place].value;

        return gold;
    }
    public Animals[] updateArray(Animals [] animalsArray, int position){
        Animals[] myArray = new Animals[animalsArray.length - 1];
        for(int x = 0, y = 0;  x < animalsArray.length; x++){
            if (x == position){
                continue;
            }
            myArray[y++] = animalsArray[x];
        }

        return myArray;
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
