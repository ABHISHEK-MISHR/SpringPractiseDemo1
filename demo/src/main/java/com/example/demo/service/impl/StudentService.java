package com.example.demo.service.impl;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.repository.IStudentRepository;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Autowired private IStudentRepository studentRepository;

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        Student student = StudentMapper.mapDTOToEntity(studentDTO);
        Student student1 = studentRepository.save(student);
        return StudentMapper.mapEntityToDTO(student1);
    }

    @Override
    public StudentDTO getStudentById(int id){
        try{
            Student student = studentRepository.findById(id).get();
            return StudentMapper.mapEntityToDTO(student);
        }
        catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Student not found");
        }
    }
}

