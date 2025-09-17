package Assignment.One.LevelThree;

/**
 * Question 11: Write a program DayOfWeek that takes a date as input and prints
 * the day of the week that the date falls on. Your program should take three
 * command-line arguments: m (month), d (day), and y (year). For m use 1 for
 * January, 2 for February, and so forth. For output print 0 for Sunday, 1 for
 * Monday, 2 for Tuesday, and so forth. Use the following formulas, for the
 * Gregorian calendar:
 * y0 = y - (14 - m) / 12
 * x = y0 + y0/4 - y0/100 + y0/400
 * m0 = m + 12 * ((14 - m) / 12) - 2
 * d0 = (d + x + 31*m0 / 12) mod 7
 */
public class DayOfWeekCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeekCalculator <month> <day> <year>");
            System.out.println("Example: java DayOfWeekCalculator 8 26 2024");
            return;
        }

        try {
            int m = Integer.parseInt(args[0]); // month
            int d = Integer.parseInt(args[1]); // day
            int y = Integer.parseInt(args[2]); // year

            int y0 = y - (14 - m) / 12;
            int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            int d0 = (d + x + (31 * m0) / 12) % 7;


            String[] dayNames = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

            System.out.println("The date " + m + "/" + d + "/" + y + " falls on a " + dayNames[d0] + ".");
            System.out.println("Numeric day of the week: " + d0);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers for month, day, and year.");
            System.out.println("Usage: java DayOfWeekCalculator <month> <day> <year>");
        }
    }
}

