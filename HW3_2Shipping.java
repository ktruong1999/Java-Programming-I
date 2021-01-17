import java.util.Scanner;

public class HW3_2Shipping {
    public static void main(String[] args) {
    Scanner input;
    input = new Scanner(System.in);
    
    System.out.print("Enter the weight of your package : ");

    double weight=input.nextDouble();

    if(weight>0 && weight <=1){
        System.out.println("Shipping Cost : $3.50");
    }else if(weight>1 && weight <=3){
        System.out.println("Shipping Cost : $5.50");
    }else if(weight > 3 && weight <=10){
        System.out.println("Shipping Cost : $8.50");
    }else if ( weight > 10 && weight <=20){
        System.out.println("Shipping Cost : $10.50");
    }else{
        System.out.println("Package cannot be shipped");
    }
    input.close();
    }
}

/*
Enter the weight of your package : 5 pounds
Shipping Cost : $8.50

Enter the weight of your package : 2
Shipping Cost : $5.50


*/