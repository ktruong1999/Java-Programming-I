import java.util.Scanner;
import java.util.Arrays;

public class HW7_3MergedLists {



    public static int[] merge(int[] list1, int[] list2) {
        int[] result = new int[list1.length + list2.length];

        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while ((current1 < list1.length) && (current2 < list2.length)) {
            if(list1[current1]<list2[current2]){
                result[current3]=list1[current1];
                current1++;
                current3++;
            }else{
                result[current3]=list2[current2];
                current2++;
                current3++;
            }
        }


        while(current1<list1.length){
         
           result[current3]=list1[current1];
           current1++;
           current3++;
        }
        while(current2<list2.length){
            result[current3]=list2[current2];
            current2++;
            current3++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter list 1 : ");
        int n = input.nextInt();
        int[] list1 = new int[n];

        for(int i=0;i<n;i++){
            list1[i]=input.nextInt();
        }


        System.out.print("Enter list 2 : ");
        int p = input.nextInt();
        int[] list2 = new int[p];
        for(int i=0;i<p;i++){
            list2[i]=input.nextInt();
        }
        //im assuming they have to already be sorted on their own?
        Arrays.sort(list1);
        Arrays.sort(list2);

        int[] listFinal = merge(list1,list2);
        System.out.print("\nMerged list output : ");
        for (int value : listFinal){
            System.out.print(value + " ");
        }

        // for (int value : list1) {
        // System.out.print(value + " ");
        // }

        input.close();

    }
}

/* OUTPUT

Enter list 1 : 5 1 5 16 61 111
Enter list 2 : 4 2 4 5 6

Merged list output : 1 2 4 5 5 6 16 61 111

*/