public class Plants {
    String type;
    int age, value, place;
    public final String[] plantsArray = {"Wheat", "Corn", "Beans", "Potatoes", "Carrots", "Apples", "Melons", "Pumpkins"};
    public Plants(){
        age = 0;
        value = 0;
    }
    public Plants(int plantPlace, int plantValue){
        age = 1;
        value = plantValue;
        type = plantsArray[plantPlace];
    }
    public void printPlantInfo(){
        System.out.println("Plant: " + this.getType());
        System.out.println("Age: " + this.getAge());
        System.out.println("Value: " + this.getValue());
    }
    public int getAge(){
        return this.age;
    }
    public int getValue(){ return this.value;}
    public String  getType(){ return this.type;}
}
