package com.project.myproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.myproject.entity.Student;

@RepositoryRestResource(path="students")
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	//no need to write any code here !!!

}
