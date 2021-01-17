import java.util.Scanner;

public class HW6_3Zeller {

    public static int getStartDay(int year, int month) {
        int y = year;
        int q = 1;
        int m = month;

        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }

        int j = y / 100;
        int k = y % 100;

        int h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;

        return h;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = input.nextInt();
        System.out.print("Enter a month : ");
        int month = input.nextInt();

        int h = getStartDay(year, month);
        String day = "";

        switch (h) {
            case 0:
                day = "Saturday";
                break;
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
                break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
        }
        System.out.println("The first day of the month is a " + day);

        input.close();
    }
}

/*OUTPUT
Enter a year : 2020
Enter a month : 7
The first day of the month is a Wednesday


Enter a year : 2020
Enter a month : 2
The first day of the month is a Saturday


*/