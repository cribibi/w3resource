package interviewproblems;

import java.util.ArrayList;
import java.util.List;

//93. Gasiti al 2 lea cel mai mare numar dintr-o lista cu duplicate
public class SecondBiggest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(90);
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
        list.add(90);
        list.add(90);
        list.add(90);
        list.add(90);
        list.add(90);

        System.out.println(getSecondMax(list));

    }

    public static int getSecondMax(List<Integer> lista) {
        int a = getMax(lista);
        doRemove(a, lista);
        a = getMax(lista);
        return a;
    }

    public static int getMax(List<Integer> lista) {
        int a = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > a) {
                a = lista.get(i);
            }
        }
        return a;
    }

    public static void doRemove(int a, List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == (a)) {
                lista.remove(lista.get(i));
                i--;
            }
        }
    }
}
