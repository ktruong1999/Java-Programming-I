import java.util.Scanner;

public class Exercise_02_15 {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.print("Enter values for x1 & y1 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter values  for x2 & y2 :");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double d;
        d = Math.pow((Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0)), 0.5);

        System.out.println("the distance between the points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + d);
        input.close();
    }
}

/* OUTPUT
Enter values for x1 & y1 : 1.5 -3.4
Enter values  for x2 & y2 :4 5
the distance between the points (1.5,-3.4) and (4.0,5.0) is 8.764131445842194
*/