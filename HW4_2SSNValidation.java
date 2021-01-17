import java.util.Scanner;

public class HW4_2SSNValidation {
    public static void main(String[] args) {
        System.out.print("Enter a SSN : ");
        Scanner input = new Scanner(System.in);
        boolean valid = true;

        String SSN = input.nextLine();

        for (int i = 0; i < 11; i++) {
            if (i == 3 || i == 6)
                continue;
            if (!Character.isDigit(SSN.charAt(i))) {
                valid = false;
                break;
            }
        }

        if (valid == false || SSN.length() != 11 || SSN.charAt(3) != '-' || SSN.charAt(6) != '-') {
            System.out.println(SSN + " is an invalid Social Security Number");
        } else {
            System.out.println(SSN + " is a valid Social Security Number");
        }
        input.close();
    }

}
/*
 * OUTPUT Enter a SSN : 123-45-6789 123-45-6789 is a valid Social Security
 * Number
 * 
 * Enter a SSN : 23-23-5435 23-23-5435 is an invalid Social Security Number
 * 
 * Enter a SSN : 123-45-678a 123-45-678a is an invalid Social Security Number
 * 
 */