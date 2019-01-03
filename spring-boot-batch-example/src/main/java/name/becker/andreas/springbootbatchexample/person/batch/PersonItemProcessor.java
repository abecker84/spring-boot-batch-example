/*
 * Copyright 2019, Andreas Becker <andreas AT becker DOT name>
 * 
 * This file is part of The Spring Boot Batch example.
 * 
 * The Spring Boot Batch example is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * The Spring Boot Batch example is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details. You should have received a copy of the GNU
 * General Public License along with The Spring Boot Batch example. If
 * not, see <http://www.gnu.org/licenses/>.
 */

package name.becker.andreas.springbootbatchexample.person.batch;

import org.springframework.batch.item.ItemProcessor;

import name.becker.andreas.springbootbatchexample.person.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	@Override
	public Person process(Person person) throws Exception {

		final String firstName = person.getFirstName().toUpperCase();
		final String lastName = person.getLastName().toUpperCase();

		final Person transformedPerson = new Person(firstName, lastName);

		System.out.println("Converting (" + person + ") into (" + transformedPerson + ")");

		return transformedPerson;
	}

}
