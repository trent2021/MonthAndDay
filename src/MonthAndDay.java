import java.util.Scanner;

public class MonthAndDay {

    public static void main(String[] args) {

        int d;
        int m;
        int Y;
        Scanner keyboard;
        keyboard = new Scanner(System.in);


        boolean loop = true;
        while (loop) {
            System.out.println("Monday's child is fair of face,\n" +
                    "Tuesday's child is full of grace,\n" +
                    "Wednesday's child is full of woe,\n" +
                    "Thursday's child has far to go.\n" +
                    "Friday's child is loving and giving,\n" +
                    "Saturday's child works hard for a living,\n" +
                    "But the child born on the Sabbath Day,\n" +
                    "Is fair and wise and good in every way.");



            System.out.println("\n" + "Enter the month you were born (1 - 12) ");

            m = keyboard.nextInt();

            System.out.println("Enter the day you were born");

            d = keyboard.nextInt();

            System.out.println("Enter the year you were born");

            Y = keyboard.nextInt();

            System.out.println("\n\n\n\n\n\n");


            System.out.println(month(m, d));



            if (day(m, d, Y) == 1) {
                System.out.println("Your birthday is on a Sunday");
            } else if (day(m, d, Y) == 2) {
                System.out.println("Your birthday is on a Monday");
            } else if (day(m, d, Y) == 3) {
                System.out.println("Your birthday is on a Tuesday");
            } else if (day(m, d, Y) == 4) {
                System.out.println("Your birthday is on a Wednesday");
            } else if (day(m, d, Y) == 5) {
                System.out.println("Your birthday is on a Thursday");
            } else if (day(m, d, Y) == 6) {
                System.out.println("Your birthday is on a Friday");
            } else if (day(m, d, Y) == 0) {
                System.out.println("Your birthday is on a Saturday");
            }

            System.out.println(poem((day(m, d, Y))));


            System.out.println("\n\n" + "Enter another date"+"\n");

        }
    }

    public static int day(int m, int d, int Y) {
        int h;


        if (m == 1) {
            m = m + 12;
            Y = Y - 1;
        } else if (m == 2) {
            m = m + 12;
            Y = Y - 1;
        }

        h = ((d + (13 * (m + 1) / 5) + Y + (Y / 4) - (Y / 100) + (Y / 400)) % 7);

        return h;
    }

    public static String month(int m, int d) {

        String answer;
        answer = "";

        switch (m) {
            case 1:
                answer = "There are 31 days in January";
                break;
            case 2:
                if (d < 29) {
                    answer = "There are 28 days in February";
                    break;
                }
                if (d == 29) {
                    answer = "There are 29 days in February";
                    break;
                }
            case 3:
                answer = "There are 31 days in March";
                break;
            case 4:
                answer = "There are 30 days in April";
                break;
            case 5:
                answer = "There are 31 days in May";
                break;
            case 6:
                answer = "There are 30 days in June";
                break;
            case 7:
                answer = "There are 31 days in July";
                break;
            case 8:
                answer = "There are 31 days in August";
                break;
            case 9:
                answer = "There are 30 days in September";
                break;
            case 10:
                answer = "There are 31 days in October";
                break;
            case 11:
                answer = "There are 30 days in November";
                break;
            case 12:
                answer = "There are 31 days in December";
                break;
        }
        return answer;
    }

    public static String poem(int h){
        String line;
        line = "";

        switch (h) {
            case 1:
                line = "You are fair and wise and good in every way";
                break;
            case 2:
                line = "You are fair of face";
                break;
            case 3:
                line = "You are full of grace";
                break;
            case 4:
                line = "You are full of woe";
                break;
            case 5:
                line = "You have far to go";
                break;
            case 6:
                line = "You are loving and giving";
                break;
            case 0:
                line = "You work hard for a living";
                break;
        }
        return line;
    }
}
