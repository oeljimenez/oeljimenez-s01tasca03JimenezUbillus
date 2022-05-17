package it.academy.java.sprint1.tasca3.n1exercisi1;

import java.util.Objects;

public class Month {
    private String nom;

    public Month(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(nom, month.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }

    @Override
    public String toString() {
        return "Month{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
