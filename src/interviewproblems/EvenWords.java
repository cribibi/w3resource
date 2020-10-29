package interviewproblems;

import java.util.ArrayList;
import java.util.List;

//100. Afisati numarul de cuvinte dintr-o lista care au lungime para.
public class EvenWords {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("mirabela");
        list.add("are");
        list.add("bianca");
        list.add("in");
        list.add("cap");
        list.add("casa");
        list.add("masa");

        getNoOfWords(list);
    }

    //good
    public static void getNoOfWords(List<String> list) {
        int a = 0;
        for (int i = 0; i <list.size() ; i++) {
           if(list.get(i).length()%2==0){
               a=a+1;
           }
        }
        System.out.println("The number of words with an even number of letters is: "+a);
    }
}
