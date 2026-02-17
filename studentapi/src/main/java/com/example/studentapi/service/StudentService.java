package com.example.studentapi.service;


import com.example.studentapi.exception.ResourceNotFoundException;
import com.example.studentapi.model.Student;
import com.example.studentapi.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository){
        this.repository=repository;
    }

    public Student addStudent(Student student){
        return repository.save(student);
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }

    public Student getStudentById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
    }
    public Student updateStudent(Long id,Student updatedStudent){
        Student existing = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));

        existing.setName(updatedStudent.getName());
        existing.setEmail(updatedStudent.getEmail());
        existing.setAge(updatedStudent.getAge());

        return repository.save(existing);
    }
    public void deleteStudent(Long id){
        if(!repository.existsById(id)){
            throw new RuntimeException("Student Not Found");
        }
         repository.deleteById(id);
    }
}
