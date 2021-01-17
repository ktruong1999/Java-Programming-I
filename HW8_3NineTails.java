import java.util.Scanner;

public class HW8_3NineTails {
    public static char[] toBinaryChars(short number){
        char[] result = new char[9];

        int i= result.length-1;
        while(number!=0){
            if(number%2==0){
                result[i--]='0';
            }else{
                result[i--]='1';
            }
            number/=2;
        }
        for(int k =i ; k>=0;k--){
            result[k]='0';
        }

        return result;
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Pick a number from 0 to 511 : ");
        short number = input.nextShort();

        char[] array = toBinaryChars(number);

        char[][] matrix = new char[3][3];

        for(int i = 0; i <3; i++){
            for(int j = 0 ; j<3;j++){
                if(array[i*3+j]=='0'){
                    matrix[i][j]='H';
                }else{
                    matrix[i][j]='T';
                }

            }
        }

        for(int i = 0 ; i <3; i++){
          System.out.println(matrix[i]);  
        }
        input.close();
    }
}   


/*OUTPUT

Pick a number from 0 to 511 : 42
HHH
THT
HTH

*/