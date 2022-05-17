package it.academy.java.sprint1.tasca3.n1exercisi1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Exercisi1 {

    public static void main(String[] args) {
        System.out.println("Tasca 03. Java Collections (Spring1), Nivell 1, Exercisi 1");

        List<Month> months = new ArrayList <>();
        months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("June"));
        months.add(new Month("Juliol"));
        months.add(new Month("Setembre"));
        months.add(new Month("October"));
        months.add(new Month("Novembre"));
        months.add(new Month("Desembre"));


        System.out.println("months -->"+months.toString());

        //adding agost in the correct position
        months.add(7, new Month("Agost"));
        System.out.println(months.toString());

        HashSet<Month> monthsHashSet = new HashSet<>();
        monthsHashSet.add(new Month("Gener"));
        monthsHashSet.add(new Month("Febrer"));
        monthsHashSet.add(new Month("Març"));
        monthsHashSet.add(new Month("Abril"));
        monthsHashSet.add(new Month("Maig"));
        monthsHashSet.add(new Month("June"));
        monthsHashSet.add(new Month("Juliol"));
        monthsHashSet.add(new Month("Setembre"));
        monthsHashSet.add(new Month("October"));
        monthsHashSet.add(new Month("Novembre"));
        monthsHashSet.add(new Month("Desembre"));
        monthsHashSet.add(new Month("Novembre"));
        monthsHashSet.add(new Month("Desembre"));
        //duplicates not allowed
        System.out.println(monthsHashSet.toString());

        //iterate the list using a for and iterator
        for (Iterator<Month> test = monthsHashSet.iterator(); test.hasNext();) {
            System.out.println(test.next());

        }
    }
}
