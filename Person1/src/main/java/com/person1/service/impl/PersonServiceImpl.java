package com.person1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person1.models.Person;
import com.person1.repo.PersonRepo;
import com.person1.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepo personRepo;
	
	@Override
	public Person insert(Person person) {
	
		return personRepo.save(person);
	}

	@Override
	public Person getPerson(Integer id) {
		
		return personRepo.findById(id).get();
	}

	@Override
	public List<Person> getAllPerson() {
		
		return personRepo.findAll();
	}

	@Override
	public String delete(Integer id) {
		
		 personRepo.deleteById(id);
		 return "person deleted";
	}
	@Override
	public Person update(Person person) {
		return personRepo.save(person);
		 
	}

}
