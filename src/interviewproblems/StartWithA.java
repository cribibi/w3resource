package interviewproblems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StartWithA {
    public static void main(String[] args) {
        int a = 0;
        try {
            Scanner scanner = new Scanner(new File("/Users/biancacricler/Documents/SoloLearn/src/Untitled.txt"));
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if ((data.charAt(0) == 'A') ||(data.charAt(0) == 'a')) {
                    a = a + 1;
                }
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(a);
    }
}
