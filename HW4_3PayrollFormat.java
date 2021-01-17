import java.util.Scanner;
public class HW4_3PayrollFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee's name : ");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week : ");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate : ");
        double pay = input.nextDouble();

        System.out.print("Enter federal tax witholding rate : ");
        double fedtax = input.nextDouble();

        System.out.print("Enter state tax witholding rate: ");
        double statetax = input.nextDouble();


        double gross = hours*pay;
        
        double fed = gross*fedtax;
        double state = gross*statetax;
        double deductions = fed+state;
        double netpay=gross-deductions;


        fedtax*=100;
        statetax*=100;

        System.out.println("\nEmployee name : " + name);
        System.out.printf("Hours worked : %4.2f",hours);
        System.out.printf("\nPay rate : $%4.2f",pay);
        System.out.printf("\nGross pay : $%4.2f",gross);
        System.out.println("\nDeductions: ");
        System.out.printf("\tFederal Witholding (" + fedtax +"%%) : $%4.2f",fed);
        System.out.printf("\n\tState Witholding ("+ statetax + "%%) : $%4.2f",state);
        System.out.printf("\n\tTotal Deduction : $%4.2f",deductions);
        System.out.printf("\nNet Pay : $%4.2f",netpay);

        input.close();

    }
}

/*OUTPUT
Employee name : Kelly
Hours worked : 10.00
Pay rate : $9.75
Gross pay : $97.50
Deductions:
        Federal Witholding (20.0%) : $19.50
        State Witholding (9.0%) : $8.78
        Total Deduction : $28.28
Net Pay : $69.23


 */