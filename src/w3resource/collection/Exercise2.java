package w3resource.collection;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("green");
        lista.add("blue");
        lista.add("yellow");
        lista.add("pink");

        metodaPrint(lista);

    }
    //tipul argumentului metodei trebuie sa fie acelasi cu tipul din
    //declaratie, cel de dinainte de egal
    public static void metodaPrint(List<String> lista) {
        for (String s : lista) {
            System.out.println(s);

        }
    }
}
