public class PlantsAndAnimals {
    String name;
    boolean type;
    int age, value;
    String[] plants = {"Wheat", "Corn", "Beans", "Potatoes", "Carrots", "Apples", "Melons", "Pumpkins"};
    String[] Animals = {"Pigs", "Cows", "Goats", "Chickens", "Sheep", "Horses", "Dogs", "Rabbits"};


    public PlantsAndAnimals(){
        name = "";
        age = 0;
        value = 0;
    }
    public PlantsAndAnimals(String myName, int myAge, int myValue){
        name = myName;
        age = myAge;
        value = myValue;
    }


}
