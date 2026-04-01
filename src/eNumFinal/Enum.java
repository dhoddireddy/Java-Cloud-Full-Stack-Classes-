//Used when values are fixed (like days, status, etc.)


package eNumFinal;


// enum = fixed set of constants
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class Enum {

    public static void main(String[] args) {

        Day today = Day.MON; // assigning one value

        System.out.println(today); 
        // prints MON

        // using enum in condition
        if (today == Day.MON) {
            System.out.println("Start of the week");
        }

        // loop through all enum values
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}