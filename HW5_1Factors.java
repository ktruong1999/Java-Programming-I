import java.util.Scanner;

public class HW5_1Factors{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to factor : ");
        int num =  input.nextInt();

        int n = num;
        String factors = "";
        int i=2;
        
        while(n>1){
            if(n%i==0){
                n=n/i;
                factors+= i +" ";
            }else{
                i++;
            }

        }   

        System.out.println("the factors of "+ num+" are : " + factors);
        input.close();
    }
}


/*  OUTPUT

Enter a number to factor : 120
the factors of 120 are : 2 2 2 3 5


Enter a number to factor : 2020
the factors of 2020 are : 2 2 5 101

*/
