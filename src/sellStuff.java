public class sellStuff {
    public static int sellAnimal(Animals [] animalsArray, int place){
        int gold;
        gold = animalsArray[place - 1].value;

        return gold;
    }
    public static Animals[] updateArray(Animals [] animalsArray, int position){
        Animals[] myArray = new Animals[animalsArray.length - 1];
        for(int x = 0, y = 0;  x < animalsArray.length; x++){
            if (x == position - 1){
                continue;
            }
            myArray[y++] = animalsArray[x];
        }

        return myArray;
    }
}