package v;

import java.util.Scanner;

public class Exercise58 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input a sentence: ");
        String sc=scanner.nextLine();
        String [] words=sc.split(" ");
        String str=new String();
        for (int i = 0; i <words.length ; i++) {
            str=str+words[i].substring(0,1).toUpperCase()+words[i].substring(1)+" ";
        }
        System.out.println(str);

    }
}
