package collection;

import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("green");
        lista.add("blue");
        lista.add("yellow");
        lista.add("pink");
        metodaPrint(lista);
        lista.add(0, "black");
        System.out.println("dupa adaugare: ");
        metodaPrint(lista);
        System.out.println("\nelementul cautat:");
        System.out.println(lista.get(0));
        String cautat=lista.get(0);
        System.out.println(cautat);


    }

    //tipul argumentului metodei trebuie sa fie acelasi cu tipul din
    //declaratie, cel de dinainte de egal
    public static void metodaPrint(ArrayList<String> lista) {
        for (String s : lista) {
            System.out.println(s);

        }

    }
}
