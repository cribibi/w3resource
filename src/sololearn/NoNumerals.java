package sololearn;

import java.util.Scanner;

public class NoNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the phrase");
        String phrase = scanner.nextLine();
        getNoNumeralsPhrase(phrase);
        getNoNumeralsPhrase2(phrase);

    }

    public static void getNoNumeralsPhrase(String phrase){
        if (phrase.contains("10")){
            phrase=phrase.replace("10", "ten");
        }

        if (phrase.contains("0")){
            phrase =phrase.replace("0", "zero");
        }
        if (phrase.contains("1")){
            phrase=phrase.replace("1", "one");
        }
        if (phrase.contains("2")){
            phrase=phrase.replace("2", "two");
        }
        if (phrase.contains("3")){
            phrase=phrase.replace("3", "three");
        }
        if (phrase.contains("4")){
            phrase=phrase.replace("4", "four");
        }
        if (phrase.contains("5")){
            phrase=phrase.replace("5", "five");
        }
        if (phrase.contains("6")){
            phrase =phrase.replace("6", "six");
        }
        if (phrase.contains("7")){
            phrase=phrase.replace("7", "seven");
        }
        if (phrase.contains("8")){
            phrase=phrase.replace("8", "eight");
        }
        if (phrase.contains("9")){
            phrase=phrase.replace("9", "nine");
        }

        System.out.println(phrase);
    }

    public static void getNoNumeralsPhrase2(String phrase){
            phrase =phrase.replace("10", "ten")
                    .replace("0", "zero")
                    .replace("1", "one")
                    .replace("2", "two")
                    .replace("3", "three")
                    .replace("4", "four")
                    .replace("5", "five")
                    .replace("6", "six")
                    .replace("7", "seven")
                    .replace("8", "eight")
                    .replace("9", "nine");

        System.out.println(phrase);
    }
}
