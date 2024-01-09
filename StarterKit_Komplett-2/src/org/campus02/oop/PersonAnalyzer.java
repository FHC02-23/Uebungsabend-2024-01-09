package org.campus02.oop;

import java.util.ArrayList;

public abstract class PersonAnalyzer {

    protected ArrayList<Person> persons = new ArrayList<>();

    // leerer Konstruktor kann gemacht werden, muss aber nicht
    public PersonAnalyzer() {
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    // abstract erzwingt die Implementierung in den Subklassen
    public abstract void analyze();
}
