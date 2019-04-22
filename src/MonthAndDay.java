import java.util.Scanner;

public class MonthAndDay {

    public static void main(String[]args) {

        int d;
        int m;
        int Y;
        Scanner keyboard;
        keyboard = new Scanner(System.in);


        boolean loop = true;
        while(loop){







            System.out.println("Enter the month you were born (1 - 12) ");

            m = keyboard.nextInt();

            System.out.println("Enter the day you were born");

            d = keyboard.nextInt();

            System.out.println("Enter the year you were born");

            Y = keyboard.nextInt();




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

            System.out.println("Enter another date");






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
}
