package org.soundarya.datacreator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PersonData {

	public static void main(String[] args) {
	
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person(1,"Soundarya","PA","2174142229"));
		persons.add(new Person(1,"Dolly","PA","2174142229"));
		persons.add(new Person(1,"Anu","PA","2174142229"));
		persons.add(new Person(1,"Puppy","PA","2174142229"));
		ListIterator<Person> iterator = persons.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}