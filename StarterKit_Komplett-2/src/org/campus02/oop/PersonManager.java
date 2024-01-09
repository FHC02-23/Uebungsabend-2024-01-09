package org.campus02.oop;

import java.util.ArrayList;

public class PersonManager {

    private ArrayList<Person> persons = new ArrayList<>();

//    public PersonManager() {
//        this.persons = new ArrayList<>();
//    }

    public void add(Person p) {
//        persons.add(p);
        this.persons.add(p);
    }

    public void doAnalysis(PersonAnalyzer a) {
        a.setPersons(this.persons);
        a.analyze();
    }
}
