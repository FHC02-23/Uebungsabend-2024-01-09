package org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer {

    @Override
    public void analyze() {
        int countM = 0;
        int countF = 0;
        int heightM = 0;
        int heightF = 0;

        // iter + tab => schleife generieren lassen
        for (Person person : persons) {
            if (person.getGender() == 'M') {
//                countM += 1;
//                countM = countM + 1;
                countM++;
                heightM += person.getSize();
            }
            if (person.getGender() == 'F') {
                countF++;
                heightF = heightF + person.getSize();
            }
        }

        int avgM = heightM / countM;
        System.out.println("In der Liste existieren " + countM +
                                   " Männer mit einer durchschnittlichen" +
                                   " Körpergröße von " + avgM + " cm");

        System.out.println("In der Liste existieren " + countF +
                                   " Frauen mit einer durchschnittlichen" +
                                   " Körpergröße von " + (heightF / countF) + " cm");
    }
}
