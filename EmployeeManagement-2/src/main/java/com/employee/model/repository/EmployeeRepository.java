package com.employee.model.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeEntity;
import com.employee.model.EmployeeResponse;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer>{


}
	static Optional<EmployeeResponse> findById(id) 
	
	{
		
		return null;
	}


	


