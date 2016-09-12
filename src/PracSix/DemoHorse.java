package PracSix;

/**
 * Created by Xileus on 12/09/2016.
 */
public class DemoHorse {
    public static void main(String[] args) {
        Horse horse = new Horse();
        RaceHorse raceHorse = new RaceHorse();
        horse.setBirthYear(66);
        horse.setColour("Brown");
        horse.setName("John");
        raceHorse.setBirthYear(87);
        raceHorse.setName("Harry");
        raceHorse.setColour("Orange");
        raceHorse.setRaces(345678);
    }
}
