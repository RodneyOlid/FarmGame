public class Plants {
    String type;
    int age, value, place;
    public static final String[] plantsArray = {"Wheat", "Corn", "Beans", "Potatoes", "Carrots", "Apples", "Melons", "Pumpkins"};
    public static final int [][] plantValues = {{10, 25}, {5, 30}, {5, 10}, {15, 20}, {10, 30}, {5, 10}, {10, 40}, {20, 50}};
    public Plants(){
    }
    public Plants(int plantPlace, int plantValue){
        age = 1;
        value = plantValue;
        type = plantsArray[plantPlace];
        place = plantValue;
    }
    public void updateValues(){
        while(this.value < plantValues[this.place][1]) {
            this.value += 5;
        }
    }
    public static String printArray(int myPlace){
        return plantsArray[myPlace];
    }
    public void printPlantInfo(){
        System.out.println("Plant: " + this.getType());
        System.out.println("Age: " + this.getAge());
        System.out.println("Value: " + this.getValue() + "gold");
    }
    public int getAge(){
        return this.age;
    }
    public int getValue(){ return this.value;}
    public String  getType(){ return this.type;}
}
