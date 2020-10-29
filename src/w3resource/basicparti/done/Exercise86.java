package w3resource.basicparti.done;

import java.util.Scanner;

public class Exercise86 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Give a number");
        int n=scanner.nextInt();
        while(n!=1){
            if (n%2==0){
                n=n/2;
                System.out.println(n);
            }else{
                n=n*3+1;
                System.out.println(n);
            }
        }

    }
}
