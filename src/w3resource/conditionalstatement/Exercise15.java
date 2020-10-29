package w3resource.conditionalstatement;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("input the number: ");
        int sc = scanner.nextInt();
        int count = 0;
        int sum = 0 ;
        int i=1;
        System.out.println("the odd numbers are: ");
        while(count<sc){
            if (i%2==1){
                System.out.println(i);
                count++;
                sum+=i;
            }
            i++;
        }
        System.out.println("The sum is : "+sum);

    }


}
