import java.util.Scanner;

public class HW5_3Calendar {

    public static boolean isLeapYear(int year) {
        if((year%4==0 && year%100 != 0)  || year%400==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year : ");
        int startDay = input.nextInt();
        

        for (int i = 1; i <= 12; i++) {

            String month = "jan";
            int numOfDays = 30;

            switch (i) {
                case 1:
                    month = "Jan " + year;
                    numOfDays = 31;
                    break;
                case 2:
                    month = "Feb  " + year;
                    if(isLeapYear(year)){
                        numOfDays =29;
                    }else{
                        numOfDays = 28;
                    }
                    break;
                case 3:
                    month = "March " + year;
                    numOfDays = 31;
                    break;
                case 4:
                    month = "April " + year;
                    numOfDays = 30;
                    break;
                case 5:
                    month = "May " + year;
                    numOfDays = 31;
                    break;
                case 6:
                    month = "June " + year;
                    numOfDays = 30;
                    break;
                case 7:
                    month = "July " + year;
                    numOfDays = 31;
                    break;
                case 8:
                    month = "Aug " + year;
                    numOfDays = 31;
                    break;
                case 9:
                    month = "Sept " + year;
                    numOfDays = 30;
                    break;
                case 10:
                    month = "Oct " + year;
                    numOfDays = 31;
                    break;
                case 11:
                    month = "Nov " + year;
                    numOfDays = 30;
                    break;
                case 12:
                    month = "Dec " + year;
                    numOfDays = 31;
                    break;

            }

            System.out.printf("%25s", month);
            System.out.println("\n---------------------------------------------");

            System.out.printf("%5s %5s %5s %5s %5s %5s %5s\n", "Sun", "Mon", "Tues", "Wed", "Thr", "Fri", "Sat");

            for (int j = 0; j < startDay; j++) {
                System.out.printf("%5s ", "");
                // white space for everyday that isn't the start day
            }

            for (int k = 1; k <= numOfDays; k++) {

                System.out.printf("%5s ", k);
                if ((k + startDay) % 7 == 0) {
                    System.out.println();
                }
            }

            // change start day
            System.out.println("\n");
            startDay = (startDay + numOfDays) % 7;

        }

        input.close();
    }

}

/* OUTPUT
Enter a year : 2012
Enter the first day of the year : 4
                 Jan 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
                            1     2     3 
    4     5     6     7     8     9    10 
   11    12    13    14    15    16    17 
   18    19    20    21    22    23    24 
   25    26    27    28    29    30    31


                Feb  2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
    1     2     3     4     5     6     7 
    8     9    10    11    12    13    14
   15    16    17    18    19    20    21 
   22    23    24    25    26    27    28 
   29

               March 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
          1     2     3     4     5     6 
    7     8     9    10    11    12    13
   14    15    16    17    18    19    20 
   21    22    23    24    25    26    27
   28    29    30    31 

               April 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
                            1     2     3
    4     5     6     7     8     9    10 
   11    12    13    14    15    16    17 
   18    19    20    21    22    23    24
   25    26    27    28    29    30

                 May 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
                                        1 
    2     3     4     5     6     7     8
    9    10    11    12    13    14    15
   16    17    18    19    20    21    22
   23    24    25    26    27    28    29
   30    31 

                June 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
                1     2     3     4     5
    6     7     8     9    10    11    12 
   13    14    15    16    17    18    19 
   20    21    22    23    24    25    26
   27    28    29    30

                July 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
                            1     2     3 
    4     5     6     7     8     9    10 
   11    12    13    14    15    16    17
   18    19    20    21    22    23    24
   25    26    27    28    29    30    31 


                 Aug 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
    1     2     3     4     5     6     7 
    8     9    10    11    12    13    14
   15    16    17    18    19    20    21 
   22    23    24    25    26    27    28
   29    30    31

                Sept 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
                      1     2     3     4 
    5     6     7     8     9    10    11 
   12    13    14    15    16    17    18
   19    20    21    22    23    24    25
   26    27    28    29    30

                 Oct 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
                                  1     2
    3     4     5     6     7     8     9 
   10    11    12    13    14    15    16
   17    18    19    20    21    22    23 
   24    25    26    27    28    29    30
   31

                 Nov 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
          1     2     3     4     5     6 
    7     8     9    10    11    12    13 
   14    15    16    17    18    19    20
   21    22    23    24    25    26    27
   28    29    30

                 Dec 2012
---------------------------------------------
  Sun   Mon  Tues   Wed   Thr   Fri   Sat
                      1     2     3     4
    5     6     7     8     9    10    11
   12    13    14    15    16    17    18
   19    20    21    22    23    24    25
   26    27    28    29    30    31


*/