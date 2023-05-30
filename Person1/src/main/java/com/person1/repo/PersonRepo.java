package com.person1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person1.models.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{

}
