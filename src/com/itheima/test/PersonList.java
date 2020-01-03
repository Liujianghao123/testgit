package com.itheima.test;

import java.util.List;

public class PersonList {

	private List<Person> persons;

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "PersonList [persons=" + persons + "]";
	}
	
}
