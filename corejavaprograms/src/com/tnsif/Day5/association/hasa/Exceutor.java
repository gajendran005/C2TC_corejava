package com.tnsif.Day5.association.hasa;

public class Exceutor {

	public static void main(String[] args) {
		Address address = new Address("756 marudham nagar, kokkupalayam", "Panruti", "Tamilnadu", "607106");
		Person person = new Person("Gajendran M", address);
		person.displayInfo();
	}

}
