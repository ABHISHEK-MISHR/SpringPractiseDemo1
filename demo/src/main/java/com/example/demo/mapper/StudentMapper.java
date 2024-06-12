package com.example.demo.mapper;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;

public class StudentMapper {
    public static Student mapDTOToEntity(StudentDTO dto) {
        Student student = new Student();
        student.setMark(dto.getMark());
        student.setName(dto.getName());
        return student;
    }

    public static StudentDTO mapEntityToDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setMark(student.getMark());
        studentDTO.setName(student.getName());
        return studentDTO;
    }
}
