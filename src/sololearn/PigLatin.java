package sololearn;

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type a sentence");
        String sentence=scanner.nextLine();
        String[] arrayOfWords=sentence.split(" ");
        for (int i = 0; i <arrayOfWords.length ; i++) {
            arrayOfWords[i]=arrayOfWords[i]+arrayOfWords[i].charAt(0)+"ay";
            arrayOfWords[i]=arrayOfWords[i].substring(1);
        }

        for (int i = 0; i <arrayOfWords.length ; i++) {
            System.out.print(arrayOfWords[i]+" ");
        }
    }
}
