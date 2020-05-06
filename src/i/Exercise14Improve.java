package i;

public class Exercise14Improve {

    public static void main(String[] args) {

        printFirstPartOfFlag();
        printLines();

    }

    public static void printFirstPartOfFlag() {
        for (int i = 0; i < 4; i++) {
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * *  ==================================");
        }
        System.out.println("* * * * * * ==================================");


    }

    public static void printLines() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <46 ; j++) {
                printEqual();
            }
            System.out.println();
        }
    }

    public static void printEqual(){
        System.out.print("=");
    }
}
