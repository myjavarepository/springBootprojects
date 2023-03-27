package com.rps.controller;

import com.rps.entity.Student;
import com.rps.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/student")

public class StandardStudentController {
    @Autowired
    private StudentService service;


    @GetMapping("/all")
    public List<Student> list()
    {
        return service.findAllStudents();

    }

  @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id)
    {

        return service.findStudentById(id);
    }
    @PostMapping(value = "/save")
    public Student createStudent(@RequestBody Student student)
    {

        return service.saveStudent(student);
    }
    
    @PostMapping(value = "/edit")
    public Student editStudent(@RequestBody Student student)
    {

        return service.editStudent(student);
    }
    
    @PostMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id)
    {

         service.deleteById(id);
         return "Deleted Record";
    }
}
