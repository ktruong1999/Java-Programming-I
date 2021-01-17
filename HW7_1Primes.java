public class HW7_1Primes {


    public static void main(String[] args) {

        final int NUM_OF_PRIMES=50;

        int[] primes = new int[NUM_OF_PRIMES];

        int prime_num = 0;
        int n = 2;

        boolean isPrime;

        while(prime_num<NUM_OF_PRIMES){
            isPrime= true;
            for(int i = 0; i<prime_num && primes[i]<= Math.sqrt(n);i++){
                if(n%primes[i]==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
                primes[prime_num]=n;
                prime_num++;
            }
            n++;
        }

        System.out.println("The first 50 prime numbers are : ");

        int count = 0;
        for(int value : primes){
            System.out.printf("%4d",value);
            count++;
            if(count%10==0){
                System.out.println();
            }
        }



    }

}

/* 
The first 50 prime numbers are :
   2   3   5   7  11  13  17  19  23  29
  31  37  41  43  47  53  59  61  67  71
  73  79  83  89  97 101 103 107 109 113
 127 131 137 139 149 151 157 163 167 173
 179 181 191 193 197 199 211 223 227 229

*/