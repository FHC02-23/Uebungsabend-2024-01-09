package org.campus02.oop;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer {

    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    private double calcBMI(Person p) {
//        double bmi = p.getWeight() / ((p.getSize() / 100.00) * (p.getSize() / 100.00));
//        return bmi;
        return p.getWeight() / ((p.getSize() / 100.00) * (p.getSize() / 100.00));
    }
    @Override
    public void analyze() {
        for (Person person : persons) {
            double bmi = calcBMI(person);
            Pair<Person, Double> bmiPair = new Pair<Person, Double>(person, bmi);
            result.add(bmiPair);
        }
    }
}
