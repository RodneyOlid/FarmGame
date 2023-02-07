public class Animals {
    String type, name;
    int age;
    public Animals(){
        type = "";
        name = "";
        age = 0;
    }
    public Animals(String animalType, String animalName, int animalAge){
        type = animalType;
        name = animalName;
        age = animalAge;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getType(){
        return this.type;
    }
}
