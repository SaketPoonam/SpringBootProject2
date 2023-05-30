package com.person1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

    @Entity
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Getter
	@Setter
	public class Person {
		
		@Id
		@GeneratedValue
		private Integer id;
		private String name;
		private Double salary;
		public Integer getId() {
			return id;
		}
		public Person(String address, String city) {
			super();
			
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
		public Person(Integer id, String name, Double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		public Person() {
			super();
			
		}
		

	}

