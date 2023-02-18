//By Rodney Olid
// Counts the total amount of objects inside the array and returns the value
public class countArrays {
    public static int arrayAmt(Object [] theArray){
        int amount = 0;
        for (int i = 0; i < theArray.length; i++){
            if(theArray[i] != null){
                amount++;
            }
        }

        return amount;
    }
}
