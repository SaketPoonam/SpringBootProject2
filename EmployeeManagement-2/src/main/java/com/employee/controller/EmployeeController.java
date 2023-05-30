package com.employee.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.EmployeeRequestModel;
import com.employee.model.EmployeeResponse;
import com.employee.model.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping(value = "/details", produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE})
	public EmployeeResponse getEmployeeDetails() {
		
		 EmployeeResponse  employeeResponse = new EmployeeResponse(100, "Poonam", "Saket", "Shiv Nagar", "Bhopal", 
				 "MP", 462010, 9896257800l,"poonam.saket@gmail.com");
		 
		 return employeeResponse;
	}
	
	@GetMapping(value = "/all/details", produces = {MediaType.APPLICATION_XML_VALUE , MediaType.APPLICATION_JSON_VALUE}) 
	public List<EmployeeResponse> getAllEmployeeDetails(){
		
		 EmployeeResponse  employeeResponse1 = new EmployeeResponse(100, "Poonam", "Saket", "Shiv Nagar", "Bhopal", 
				 "MP", 462010, 9896257800l,"poonam.saket@gmail.com");
		 EmployeeResponse  employeeResponse2 = new EmployeeResponse(101, "Ajay", "Verma", "Gupta Nagar", "Bhopal", 
				 "MP", 462011, 9589425780l,"ajay.verma@gmail.com");
		 EmployeeResponse  employeeResponse3 = new EmployeeResponse(102, "Vijay", "Rai", "Vidisha Road", "Bhopal", 
				 "MP", 462810, 9893512679l,"vijay.rai@gmail.com");
		 
		 List<EmployeeResponse> listOfEmployee = new ArrayList<EmployeeResponse>();
		 listOfEmployee.add(employeeResponse1);
		 listOfEmployee.add(employeeResponse2);
		 listOfEmployee.add(employeeResponse3);
		  
		 return listOfEmployee;
		
	}

	
	//@PostMapping(value = "/create")
	//public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeRequestModel employeeRequestModel) {

		//EmployeeResponse employeeResponse = employeeService.saveEmployee(employeeRequestModel);

		//ResponseEntity<EmployeeResponse> response = new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.CREATED);
		
		//return response;
		
	@PostMapping(value ="/create/new")
			
	public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeRequestModel employeeRequestModel){
	
	EmployeeResponse employeeResponse = employeeService.saveEmployee(employeeRequestModel);
	ResponseEntity<EmployeeResponse> response = new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.CREATED);
	
	return response;
}
	
	
    
	}
