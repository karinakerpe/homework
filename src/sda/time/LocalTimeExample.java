package sda.time;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Set;

public class LocalTimeExample {
    public static void main(String[] args) {
        parseTimeFromString();

        showConstantTimes();
        showDurationForLongIterations();

        showCustomTimes();

        showWithUsagesOfTime();

        final Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
for (String availableZoneId :availableZoneIds ){
    System.out.println(availableZoneId);
}

        ZoneId zoneId = ZoneId.of("Europe/London");
        LocalTime time = LocalTime.now(zoneId);
        System.out.println("London current time: "+time);


    }

    private static void showWithUsagesOfTime() {
        System.out.println("\n"+LocalTime.now());
        System.out.println("Changing hour to 12:xx:xx :"+LocalTime.now().withHour(12));
    }

    private static void parseTimeFromString() {
        System.out.println("Parsing time with zone: "+LocalTime.parse("12:32:34+01:00", DateTimeFormatter.ISO_OFFSET_TIME));
    }

    private static void showCustomTimes() {
        System.out.println("--Custom time----");
        LocalTime timeOfCustom = LocalTime.of(20,35);
        System.out.println("Minute of Hour: "+timeOfCustom.get(ChronoField.MINUTE_OF_HOUR));


        LocalTime timeOfCustomHHMMSS = LocalTime.of(20,35, 15);
        LocalTime timeOfCustomWithNANOseconds = LocalTime.of(20,35, 15, 556643);
        System.out.printf("Time Custom HH:MM: %s\nTime Custom HH:MM:SS: %s\nTime Custom HH:MM:SS:NNNNNNNN %s",timeOfCustom, timeOfCustomHHMMSS, timeOfCustomWithNANOseconds);

    }

    private static void showConstantTimes() {
        System.out.println("-TIME CONSTANTS-");
        LocalTime timeMaX = LocalTime.MAX;
//        LocalTime.MAX = LocalTime.MIN;- ir final metode, tādēļ nevar iedot jaunu vērtību
        LocalTime timeMin = LocalTime.MIN;
        LocalTime timeNoon = LocalTime.NOON;
        LocalTime timeMidnight = LocalTime.MIDNIGHT;
        System.out.println(String.format("Max: %s, Min: %s, Noon: %s, Midnight: %s", timeMaX, timeMin, timeNoon, timeMidnight));
        System.out.printf("MIN time: %s, Max time: %s\n", timeMin, timeMaX);
    }

    public static void showDurationForLongIterations() {

//        LocalTime time =new LocalTime(); - šādi mēs nedaram, jo tā ir privātā klase, nāk no .jar faila, kas jua ir kompilēts
//izmantojam static metodes zem LocalTime
        LocalTime startTime = LocalTime.now();
        System.out.println("--duration of the iteration--");
        int sum = 0;
        System.out.println("This is start time form our system:  " + startTime);

        for (int i = 0; i < 10000; i++) {
            sum += i;
        }
        System.out.println("Total:  " + sum);
        LocalTime endTime = LocalTime.now();

        System.out.println("This is end time form our system:  " + endTime);

    }


}
