package interviewproblems;

import java.util.ArrayList;
import java.util.List;

//98. Verificati daca exista 2 numere intr-o lista a caror suma este 100.
public class Sum100 {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(50);
        list.add(20);
        list.add(65);
        list.add(10);
        list.add(80);
        list.add(90);
        list.add(15);
        list.add(70);
        list.add(30);
        list.add(35);


        /*
            Complexitate O(n*n). E suficient pentru interviu. Dar vezi daca reusesti cu 0(n).
            creezi un Map si pui numerele in map.Inainte sa le pui, verifici daca exista complementarul lui( sa faca impreuna suma).
            Daca da, le afisezi. Sau afisezi true, fii atenta la cerinta la interviu.
            Daca iti cere sa afisezi perechile, sa afisezi doar numarul perechilor sau doar daca exista in cazul de fata.
            Poti face un algoritm mai rapid daca ai nevoie de mai putina informatie ca rezultat.
        */
        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = i+1; j <list.size() ; j++) {
                if (list.get(i)+list.get(j)==100){
                    System.out.println(list.get(i)+" plus "+list.get(j)+" = 100");
                }

            }

        }



    }
}
