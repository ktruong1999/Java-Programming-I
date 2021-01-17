import java.util.Scanner;

public class HW8_1MatrixDiagonal {

    public static double sumMajorDiagonal(double[][] m){

        double sum = 0;
        for(int i = 0; i<4;i++){
            sum+=m[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4x4 matrix row by row : ");

        double[][] matrix= new double[4][4];
        for(int i=0;i<4;i++){
            for(int j=0; j<4; j++){
                matrix[i][j]=input.nextDouble();
            }
        }

        System.out.print("\nThe sum of the elements in the major diagonal is : " +  sumMajorDiagonal(matrix));
        


        //sicc bruh
        // for(int i=0;i<4;i++){
        //     for(int j=0; j<4; j++){
        //         System.out.print(matrix[i][j] + " ");
                
        //     }
        //     System.out.println();
        // }
        input.close();
    }
}


/* OUTPUT

Enter a 4x4 matrix row by row :
1 2 3 4.0
5 6.5 7 8
9 10 11 12
13 14 15 16

The sum of the elemnents in the major diagonal is : 34.5


Enter a 4x4 matrix row by row :
2 0 1 7
1 9 9 9
1 30 0 0
11 17 9 9

The sum of the elements in the major diagonal is : 20.0


*/