import java.util.Scanner;

public class HW7_2Students {

    public static void sSort(double[] list, String[] n) {
        // can you do ascending order with binary swapping??

        for (int i = 0; i < list.length - 1; i++) {
            double max = list[i];
            int maxIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (max < list[j]) {
                    max = list[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                // score swap
                double temp = list[i];
                list[i] = list[maxIndex];
                list[maxIndex] = temp;
                // name swap
                String ntemp = n[i];
                n[i] = n[maxIndex];
                n[maxIndex] = ntemp;

            }
        }

      

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of students : ");
        int n = input.nextInt();

        System.out.println();

        String[] names = new String[n];
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + " : ");
            names[i] = input.next();

        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the score for student " + (i + 1) + " : ");
            scores[i] = input.nextDouble();
        }

        sSort(scores,names);

        System.out.println("\nStudent scores in descending order");
        // for(int i = 0; i <n;i++){
        //     System.out.println(names[i] +" " +scores[i]);
        // }
        
        for(int i=0; i<n; i++){
            System.out.printf("%-10s \t",names[i]);
            System.out.print(scores[i]);

            System.out.println();
        }


        input.close();
    }
}

/*
 * OUTPUT
 * 
Enter the total number of students : 5

Enter the name of student 1 : Kelly
Enter the name of student 2 : Jake
Enter the name of student 3 : Nick
Enter the name of student 4 : Takyiu
Enter the name of student 5 : Jasper

Enter the score for student 1 : 23
Enter the score for student 2 : 26
Enter the score for student 3 : 24
Enter the score for student 4 : 0
Enter the score for student 5 : 1

Student scores in descending order
Jake            26.0
Nick            24.0
Kelly           23.0
Jasper          1.0
Takyiu          0.0



 */