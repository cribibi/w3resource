package interviewproblems;

import java.util.ArrayList;
import java.util.List;

public class StringInversed {
    public static void main(String[] args) {
        String word = "string";
        StringBuilder cuvantintors = new StringBuilder("");
        StringBuilder cuvantintors2 = new StringBuilder(word);
        List<Character> list = new ArrayList<>();

        for (int i = word.length() - 1; i > -1; i--) {
            list.add(word.charAt(i));
            cuvantintors.append(word.charAt(i));
        }

        System.out.println("--------First method with StringBuilder --------------------------");
        System.out.println(cuvantintors);
        System.out.println("---------------------------");
        String cuvantfinal = cuvantintors.toString();
        System.out.println(cuvantfinal);

        System.out.println("--------Second method with List--------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        System.out.println("--------Third method with StringBuilder Reverse--------------------------");
        System.out.println(cuvantintors2.reverse());

        System.out.println("--------Forth method--------------------------");
        for (int i = word.length() - 1; i > -1; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
