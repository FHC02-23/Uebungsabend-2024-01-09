package org.campus02.oop;

import java.util.HashSet;

public class MaxSalaryAnalyzer extends PersonAnalyzer {
    @Override
    public void analyze() {
        HashSet<Person> personsWithHighestSalary = new HashSet<>();
        int highestSalary = 0;

        // iter
        for (Person person : persons) {
            if (person.getSalary() > highestSalary) {
                highestSalary = person.getSalary();
                personsWithHighestSalary.clear(); // set leeren da neue Person mit absolut höchstem Salary
                personsWithHighestSalary.add(person);
            } else if (person.getSalary() == highestSalary) {
                personsWithHighestSalary.add(person);
            }
        }

        // Ausgabe aller Personen mit höchstem Gehalt
        System.out.println("Anzahl Personen mit höchstem Gehalt: " + personsWithHighestSalary.size());
        for (Person person : personsWithHighestSalary) {
            System.out.println("Person mit höchstem Gehalt: " + person);
        }
    }
}
