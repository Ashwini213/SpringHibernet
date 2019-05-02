/**
 * 
 */
package com.bridgelabz.dao;

import java.util.List;

import com.bridgelabz.model.Person;

/**
 * @author all
 *
 */
public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
}
