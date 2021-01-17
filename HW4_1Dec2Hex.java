import java.util.Scanner;

public class HW4_1Dec2Hex {
    public static void main(String[] args) {
        System.out.print("Enter an decimal value (0 to 15) : ");
        Scanner input = new Scanner(System.in);

        int d = (int)input.nextDouble();

        char hex = '1';

        if (d > 15 || d < 0) {
            System.out.println(d + " is not a valid entry.");
        } else {
            switch (d) {
                case (10):
                    hex = 'A';
                    break;
                case (11):
                    hex = 'B';
                    break;
                case (12):
                    hex = 'C';
                    break;
                case (13):
                    hex = 'D';
                    break;
                case (14):
                    hex = 'E';
                    break;
                case (15):
                    hex = 'F';
                    break;
                default:
                    hex = (char) (d+48);
                    //+48 because casting an int to a char reads the ascii code
            }
        
        }
        System.out.println("The hex value is " + hex);
        input.close();
    }
}

/*OUTPUT

Enter an decimal value (0 to 15) : 10
The hex value is A


Enter an decimal value (0 to 15) : 1
The hex value is 1


*/