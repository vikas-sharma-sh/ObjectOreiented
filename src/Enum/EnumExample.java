package Enum;
// Enum to represent days of the week
enum Day {
    SUNDAY("It's the first day of the week"),
    MONDAY("Start of the work week"),
    TUESDAY("Second day of the work week"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost the weekend"),
    FRIDAY("Last day of the work week"),
    SATURDAY("Weekend!");

    // Instance variable to hold the description for each day
    private String description;

    // Constructor to initialize description for each day
    Day(String description) {
        this.description = description;
    }

    // Method to get the description for a day
    public String getDescription() {
        return description;
    }

    // Method to check if it's a weekend
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    // Method to get the next day
    public Day nextDay() {
        Day[] days = Day.values();
        int nextIndex = (this.ordinal() + 1) % days.length;
        return days[nextIndex];
    }
}

public class EnumExample {
    public static void main(String[] args) {
        // Iterating over all days
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }

        // Checking if a specific day is a weekend
        System.out.println("\nIs Saturday a weekend? " + Day.SATURDAY.isWeekend());

        // Getting the next day
        System.out.println("\nThe day after Monday is: " + Day.MONDAY.nextDay());
    }
}
