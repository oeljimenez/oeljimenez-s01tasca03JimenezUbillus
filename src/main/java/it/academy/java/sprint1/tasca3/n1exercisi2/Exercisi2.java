package it.academy.java.sprint1.tasca3.n1exercisi2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Exercisi2 {

    public static void main(String[] args) {
        System.out.println("Tasca 03. Java Collections (Spring1), Nivell 1, Exercisi 2");

        //creating first list
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 11 ; i++) {
            list.add(i);
        }
        System.out.println(list.toString());

        // Generate an iterator to iterate List in reverse
        ListIterator<Integer> gfg_itr
                = list.listIterator(list.size());
        //new list creation
        List<Integer> list2 = new ArrayList<>();
        while (gfg_itr.hasPrevious())  {
            // Iterate in reverse
            list2.add(gfg_itr.previous());
        }
        System.out.println(list2.toString());
    }
}
