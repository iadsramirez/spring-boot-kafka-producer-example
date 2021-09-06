package com.techprimers.kafka.springbootkafkaproducerexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")

public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
    private String dept;
    private Long salary;
    
    
    public User() {
    	
    }

    public User(String name, String dept, Long salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary
       + "]";
    }
    
    
}
