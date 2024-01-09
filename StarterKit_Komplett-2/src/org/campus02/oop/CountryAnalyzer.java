package org.campus02.oop;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer {

    // key = Land
    // value = Anzahl der Personen aus diesem Land
    private HashMap<String, Integer> result = new HashMap<>();

    public HashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        for (Person person : persons) {
            String country = person.getCountry();
            if (result.containsKey(country)) {
                result.put(country, result.get(country) + 1);
//                Integer count = result.get(country);
//                result.put(country, count + 1);
            } else {
                result.put(country, 1);
            }
        }
    }


    public void analyze2() {
        for (Person person : persons) {
            Integer count = result.getOrDefault(person.getCountry(), 0);
            result.put(person.getCountry(), count + 1);
        }
    }
}
