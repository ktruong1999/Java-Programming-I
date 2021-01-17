import java.util.Scanner;
import java.util.Arrays;

public class HW8_2SortColumns {

    public  static double[][] sortColumn(double[][]m){
        double[][] result = new double[3][3];

        for(int j =0; j < m[0].length;j++){

            //column j temporary array
            double[] temp = new double[m.length];
            for(int i =0; i<temp.length;i++){
                temp[i]=m[i][j];
            }
            Arrays.sort(temp);

            for(int i = 0; i<temp.length;i++){
                result[i][j]=temp[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a 3x3 matrix row by row : ");
        double[][] matrix = new double[3][3];

        for(int i = 0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j]=input.nextDouble();
            }
        }    

        double[][] result = sortColumn(matrix);
        System.out.println("\nThe column sorted array is : ");

        //to print out the aray 
        for(int i = 0; i<3; i++){
            for(int j=0; j<03; j++){
                //printf is weird for this but try to get it to work maybbe
                System.out.print( result[i][j] + " ");
            }
            System.out.println();
        }    
        input.close();

    }
}

/* OUTPUT

Enter a 3x3 matrix row by row :
0.14 0.865 0.375
0.55 0.005 0.225
0.30 0.12 0.4

The column sorted array is :
0.14 0.005 0.225
0.3 0.12 0.375
0.55 0.865 0.4


*/