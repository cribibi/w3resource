package basicparti.iii;

public class Exercise38 {
    public static void main(String[] args) {
        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                space = space + 1;
            } else if (Character.isDigit(str.charAt(i))) {
                number = number + 1;
            } else if (Character.isLetter(str.charAt(i))) {
                letter = letter + 1;
            } else {
                other = other + 1;
            }
        }
        System.out.println("The string is: " + str);
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);


    }
}
