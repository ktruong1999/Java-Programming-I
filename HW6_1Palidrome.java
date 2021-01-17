import java.util.Scanner;

public class HW6_1Palidrome {

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number /= 10;
        }

        return result;
    }

    public static boolean isPalindrome(int number) {
        if (reverse(number) == number) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to see if it's a palindrome : ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome!");
        } else {
            System.out.println(number + " is not a palindrome....");
        }

        input.close();
    }
}


/*

Enter a number to see if it's a palindrome : 12345
12345 is not a palindrome....


Enter a number to see if it's a palindrome : 666666666
666666666 is a palindrome!

*/