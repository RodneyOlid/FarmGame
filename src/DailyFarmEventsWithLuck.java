import java.util.Random;


//God'sfavour Sunday
public class DailyFarmEventsWithLuck { //arrays if different diseases and strings and such

    public String[] crops = {"corn", "wheat", "soybeans", "tomatoes", "potatoes", "cucumbers", "peppers"};
    public String[] animalDiseases = {"foot-and-mouth disease", "avian influenza", "swine fever", "mad cow disease", "brucellosis", "rabies", "Newcastle disease"};
    public String[] events = {"rainy weather", "drought", "heat wave", "pest infestation", "equipment breakdown", "crop failure"};

    private Random random = new Random();

    public String[] generateDailyEvents() {
        String[] dailyEvents = new String[3];
        dailyEvents[0] = crops[random.nextInt(crops.length)];
        dailyEvents[1] = animalDiseases[random.nextInt(animalDiseases.length)];
        dailyEvents[2] = events[random.nextInt(events.length)];
        return dailyEvents;
    }
    public int generateDailyLuck() {
        return random.nextInt(11); // returns a random value between 0 and 10
    }


//    public static void main(String[] args) { //this is the output and I used it to test the code and return a value
//        DailyFarmEventsWithLuck farmEvents = new DailyFarmEventsWithLuck();
//        String[] dailyEvents = farmEvents.generateDailyEvents();
//        int dailyLuck = farmEvents.generateDailyLuck();
//        System.out.println("Today's events on the farm are:");
//        System.out.println("- Crop: " + dailyEvents[0]);
//        System.out.println("- Animal disease: " + dailyEvents[1]);
//        System.out.println("- Event: " + dailyEvents[2]);
//        System.out.println("Today's luck value is: " + dailyLuck);
//        System.out.println((50 * dailyLuck) / 100);
//    }
}