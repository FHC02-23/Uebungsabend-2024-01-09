package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoApp {

	public static void main(String[] args) {

		PersonManager pm = new PersonManager();
		for (int i = 1; i <= 100; i++) {
			Person p = createTestPerson();
			pm.add(p);

			// zweite Möglichkeit
//			pm.add(createTestPerson());
		}

		GenderAnalyzer genderAnalyzer = new GenderAnalyzer();
		pm.doAnalysis(genderAnalyzer);

		CountryAnalyzer countryAnalyzer = new CountryAnalyzer();
		pm.doAnalysis(countryAnalyzer);
		HashMap<String, Integer> result = countryAnalyzer.getResult();
//		for (String key : result.keySet()) {
//			System.out.println(key + " : " + result.get(key));
//		}
		for (Map.Entry<String, Integer> countryCountEntry : result.entrySet()) {
			System.out.println(countryCountEntry.getKey() + " : " + countryCountEntry.getValue());
		}

		System.out.println();
		MaxSalaryAnalyzer maxSalaryAnalyzer = new MaxSalaryAnalyzer();
		pm.doAnalysis(maxSalaryAnalyzer);

		System.out.println();
		BMIAnalyzer bmiAnalyzer = new BMIAnalyzer();
		pm.doAnalysis(bmiAnalyzer);

		// STRG + ALT + v => in variable speichern
		ArrayList<Pair<Person, Double>> bmiAnalyzerResult = bmiAnalyzer.getResult();
		for (Pair<Person, Double> personDoublePair : bmiAnalyzerResult) {
			System.out.println(personDoublePair.getKey().getLastname() + " : " + personDoublePair.getValue() + " bmi");
		}
	}
	
	
	public static Person createTestPerson()
	{
		String[] firstnames = new String[] {"John", "Max", "Susi", "Georg", "Gerald", "Michael", "Steve", "J�rg", "Sebastian", "Louis", "Thomas", "Tom", "Sandra", "Beate", "Birgit"};
		String[] lastnames = new String[] {"Muster", "Doe", "Schultz", "Cuevas", "Rhodes", "Mckenzie", "Taylor", "Glenn", "Reilly", "Morris", "Herman", "Beltran", "Swanson", "Roth"};
		String[] eyeColors = new String[] {"blau", "braun", "gruen", "gelb"};
		String[] countries = new String[] {"AT", "DE", "CH", "SI"};
		char[] genders = new char[] {'M', 'F'};
		
		Person p = new Person(
				getRandom(firstnames), getRandom(lastnames), 
				getRandom(genders), 
				(int) (Math.random()* 100.0), 
				getRandom(countries), (int) (Math.random() * 5900) + 1000, 
				getRandom(eyeColors), (int) (Math.random() * 50) + 50,
				(int)(Math.random() * 50) + 160);
		
		
	
		return p;
	}
	
	public static String getRandom(String[] arr)
	{
		return arr[(int) (Math.random() * 100.0) % arr.length];
	}
	
	public static char getRandom(char[] arr)
	{
		return arr[(int) (Math.random() * 100) % arr.length];		
	}
	
}
