package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO) {
        StudentDTO responseDTO = studentService.createStudent(studentDTO);
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }

    @GetMapping("/{studenId}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable int studenId) {
        StudentDTO responseDTO = studentService.getStudentById(studenId);
        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }
}
