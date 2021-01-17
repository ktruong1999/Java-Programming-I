import java.util.Scanner;

public class HW3_1QuadraticFormula{
    public static void main(String[] args) {
        System.out.print("Enter a b c : ");

        Scanner input;
        input = new Scanner(System.in);

        double a = input.nextDouble();
        double b =input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (Math.pow(b,2.0))-(4.0*a*c);

        if(discriminant >0){

            double r1= (-b+Math.pow(discriminant,0.5))/2.0*a;
            double r2= (-b-Math.pow(discriminant,0.5))/2.0*a;

            System.out.println("This system has two roots " + r1 + " and " + r2);

        }else  if(discriminant ==0){
            double r1= (-b - Math.pow(discriminant,0.5))/2*a;
            System.out.println("this system has one root " +  r1);

        }else{
            System.out.println("this system has no real roots");
        }
        input.close();
    }
    
}

/*OUTPUT
Enter a b c : 1 2 -3
This system has two roots 1.0 and -3.0

Enter a b c : 1 3 1
This system has two roots -0.3819660112501051 and -2.618033988749895

Enter a b c : 1 2 1
this system has one root -1.0

Enter a b c : 1 2 3
this system has no real roots
*/