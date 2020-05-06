package v;

import java.util.Scanner;

public class Exercise60 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sc=scanner.nextLine();
        String [] words=sc.split(" ");
        System.out.println(words[words.length-2]);

    }
}
