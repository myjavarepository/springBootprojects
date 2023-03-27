package com.rps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rps.entity.Student;
import com.rps.repository.StudentRepository;

import java.util.List;


@Service



public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
    	
    	return studentRepository.save(student);

         
    }
    
 public Student editStudent(Student student) {
	 
    	
    	return studentRepository.save(student);

         
    }
 
 public void deleteById(Long studentId) {
	 
 	
 	 studentRepository.deleteById(studentId);

      
 }

    public Student findStudentById(Long id) {
       return studentRepository.findById(id).get();
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
