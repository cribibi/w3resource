package interviewproblems;

import java.util.ArrayList;
import java.util.List;

//99. Stergeti toate numerele 0 dintr-o lista(3 moduri)
public class Remove0 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(0);
        removeFirstMethod(list);
    }

    public static void removeFirstMethod(List<Integer> list){
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)==0){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }
}
