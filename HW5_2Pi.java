
public class HW5_2Pi {
    public static void main(String[] args) {
        
        double pi = 0;
        for(int i=1;i<=100000;i++){
            double p= Math.pow(-1,(i+1))/(2*i-1);
            pi+=p;
            if(i%10000==0){
                System.out.println("when i is " + i + " pi is approximately :" + 4*pi);
            }
        }

        System.out.println("\nFinal approximation : " + 4*pi);

    }
    
}

/* OUTPUT

when i is 10000 pi is approximately :3.1414926535900345
when i is 20000 pi is approximately :3.1415426535898248
when i is 30000 pi is approximately :3.141559320256462
when i is 40000 pi is approximately :3.1415676535897985
when i is 50000 pi is approximately :3.1415726535897814
when i is 60000 pi is approximately :3.141575986923102
when i is 70000 pi is approximately :3.141578367875482
when i is 80000 pi is approximately :3.1415801535897496
when i is 90000 pi is approximately :3.1415815424786238
when i is 100000 pi is approximately :3.1415826535897198

Final approximation : 3.1415826535897198
*/