public class HW6_2Craps {

    public static int getDice() {
        int d1 = (int) (Math.random() * 6 + 1);
        int d2 = (int) (Math.random() * 6 + 1);
        int result = d1 + d2;
        System.out.println("You rolled " + d1 + " + " + d2 + " = " + result);
        return result;
    }

    public static void main(String[] args) {
        int roll = getDice();
        int point = 0;

        if (roll == 2 || roll == 3 || roll == 12) {
            System.out.println("Craps! YOU LOSEEEE");
        } else if (roll == 7 || roll == 11) {

            System.out.println("Natural! YOU WINNNN");
        } else {
            while (roll != 7 && point != roll) {
                System.out.println("point is " + roll);
                point = roll;
                roll = getDice();
            }
            if(roll==7){
                System.out.println("YOU LOSEEEEE");
            }else{
                System.out.println("you win :0)");
            }
            
        }

    }

}

/*
You rolled 1 + 3 = 4
point is 4
You rolled 1 + 3 = 4
you win :0)

You rolled 5 + 2 = 7
Natural! YOU WINNNN

You rolled 2 + 3 = 5
point is 5
You rolled 2 + 6 = 8
point is 8
You rolled 2 + 3 = 5
point is 5
You rolled 5 + 5 = 10
point is 10
You rolled 4 + 2 = 6
point is 6
You rolled 4 + 1 = 5
point is 5
You rolled 6 + 1 = 7
YOU LOSEEEEE

*/