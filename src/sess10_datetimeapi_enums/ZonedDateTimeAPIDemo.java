package sess10_datetimeapi_enums;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import util.Spacer;

/**
 * Java program to demonstrate the use of the OffsetDateTime, OffsetTime,
 * ZonedDateTime, ZoneId and ZoneOffset classes from the java.time package.
 * 
 * 1. OffsetDateTime: Represents a date-time with an offset from UTC/Greenwich. 
 * 2. OffsetTime: Represents a time with an offset from UTC/Greenwich (no date).
 * 3. ZonedDateTime: Represents a date-time with a time zone.
 * 4. ZoneId: Represents a time zone identifier (e.g., "Africa/Nairobi"). 
 * 5. ZoneOffset: Represents a fixed offset from UTC/Greenwich
 * 
 * @author a.nyanjui
 */
public class ZonedDateTimeAPIDemo
{
    //============================================
    // Class Methods
    // 1. Demonstrate the OffsetDateTime class
    //============================================
    private static void demoOffsetDateTime()
    {
        System.out.println("1. OffsetDateTime: Handles Date-time with an offset "
                + "from the UTC/Greenwich.");
        
        // Get & display the current date & time with an offset from UTC
        OffsetDateTime nowWithOffset = OffsetDateTime.now();
        System.out.println("Current OffsetDateTime (with system default "
                + "offset): " + nowWithOffset);
        
        // Create & display a specific OffsetDateTime (e.g., 2025-03-25T07:30:00+3:00)
        OffsetDateTime birthdayOffsetDateTime = OffsetDateTime.of(2025, 3, 25, 
                7, 30, 0, 0, ZoneOffset.ofHours(3));
        System.out.println("Birthday with OffsetDateTime: "
                + "(2025-03-25T07:30:00+3:00):" + birthdayOffsetDateTime);
        
        // Add/subtract & display time with OffsetDateTime
        OffsetDateTime fourDaysLater = nowWithOffset.plusDays(4);
        System.out.println("Four days after nowWithOffset: " + fourDaysLater);
        OffsetDateTime twoHoursEarlier = nowWithOffset.minusHours(2);
        System.out.println("Two hours before nowWithOffset: " + twoHoursEarlier);
    }
    
    //============================================
    // 2. Demonstrate the OffsetTime class
    //============================================
    private static void demoOffsetTime()
    {
        System.out.println("2. OffsetTime: Handles time with an offset (no Date) "
                + "from the UTC/Greenwich.");
        
        // Get and display the current time with an offset from the UTC
        OffsetTime currentTimeWithOffset = OffsetTime.now();
        System.out.println("Current OffsetTime  (with system default offset) "
                + "is: " + currentTimeWithOffset);
        
        // Create and display specific OffsetTime (e.g., 15:30:00+2:00)
        OffsetTime specificOffsetTime = OffsetTime.of(15, 30, 0, 0,
                ZoneOffset.ofHours(2));
        System.out.println("Specific OffsetTime (15:30:+2:00): " + specificOffsetTime);
        
        // Add/subtract & display time with OffsetTime
        System.out.println("Three hours after current offset time "
                + "will be: " + currentTimeWithOffset.plusHours(3));
        System.out.println("Twenty five minutes before current offset time "
                + "was: " + currentTimeWithOffset.minusMinutes(25));
    }
    
    //============================================
    // 3. Demonstrate the ZonedDateTime class
    //============================================
    private static void demoZonedDateTime()
    {
        System.out.println("3. ZonedDateTime: Handles Date-Time with a Time Zone .");
        
        // Get and display the current date & time in a specific 
        // time zone (e.g., Nairobi, Tokyo, London, Moscow)
        // "Africa/Nairobi", "Asia/Tokyo", "Europe/London","Europe/Moscow"
        ZonedDateTime nowInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current ZonedDateTime in New York is: " + nowInNewYork);
        
        // Create & display a specific ZonedDateTime (e.g. 2025-12-12T14:30:00+09:00[Asia/Tokyo])
        ZonedDateTime tokyoZonedDateTime = 
                ZonedDateTime.of(2025, 12, 12, 14, 30, 0, 0, ZoneId.of("Asia/Tokyo"));
        System.out.println("Specific ZonedDateTime in Tokyo, "
                + "Japan (2025-12-12T14:30:00+09:00[Asia/Tokyo]) is:"
                + " " + tokyoZonedDateTime);
        
        // Convert ZonedDateTime to a different time Zone (e.g. UTC)
        System.out.println("NewYork ZonedDateTime converted to UTC is: "
                + "" + nowInNewYork.withZoneSameInstant(ZoneId.of("UTC")));
    }
    //=============================================
    //4. Demonstrating the ZoneId class
    //=============================================
    private static void demoZoneId() 
    {
        System.out.println("4. ZoneId: Handling Time Zone Identifiers");

        // Get the system's default time zone
        ZoneId systemZoneId = ZoneId.systemDefault();
        System.out.println("System Default Time Zone: " + systemZoneId);

        // Get a time zone by ID (e.g., Nairobi)
        ZoneId newYorkZone = ZoneId.of("Africa/Nairobi");
        System.out.println("New York Time Zone: " + newYorkZone);

        // Get all available time zones
        System.out.println("Available Time Zones:");
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }

    //=============================================
    //5. Demonstrating the ZoneOffset class
    //=============================================
    private static void demoZoneOffset() 
    {
        System.out.println("5. ZoneOffset: Handling Fixed Offsets from UTC");

        // Get the system's current UTC offset
        ZoneOffset systemOffset = ZoneOffset.systemDefault().getRules().getOffset(java.time.Instant.now());
        System.out.println("System's Current UTC Offset: " + systemOffset);

        // Create a specific ZoneOffset (e.g., UTC+2 hours)
        ZoneOffset offsetPlusTwo = ZoneOffset.ofHours(2);
        System.out.println("ZoneOffset UTC+2: " + offsetPlusTwo);

        // Create a specific ZoneOffset (e.g., UTC-5 hours)
        ZoneOffset offsetMinusFive = ZoneOffset.ofHours(-5);
        System.out.println("ZoneOffset UTC-5: " + offsetMinusFive);
    }
    
    // main method begis program execution
    public static void main(String[] args)
    {
        // 1. Demonstrate the OffsetDateTime class
        demoOffsetDateTime();
        Spacer.separator();
        
        // 2. Demonstrate the OffsetTime class
        demoOffsetTime();
        Spacer.separator();
        
        // 3. Demonstrate the ZonedDateTime class
        demoZonedDateTime();
        Spacer.separator();
        
        // 4. Demonstrate the OffsetTime class
        demoZoneId();
        Spacer.separator();
        
        // 5. Demonstrate the ZonedDateTime class
        demoZoneOffset();
        Spacer.separator();
    }
}
