package w3resource.string;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input the String = ");
        String str=scanner.nextLine();
        System.out.print("input the position = ");
        int pos=scanner.nextInt();

        System.out.println("The character at position "+pos+ " is "+str.charAt(pos));
    }
}
