package w3resource.conditionalstatement;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("give a number: ");
        int sc=scanner.nextInt();
        if (sc>0){
            System.out.println("positive");
        }else if(sc<0){
            System.out.println("negative");
        } else System.out.println("zero");
    }
}
