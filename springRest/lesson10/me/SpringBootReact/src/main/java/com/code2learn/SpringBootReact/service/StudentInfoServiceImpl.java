package com.code2learn.SpringBootReact.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2learn.SpringBootReact.model.StudentInfo;
import com.code2learn.SpringBootReact.repo.StudentInfoRepo;

@Service
public class StudentInfoServiceImpl implements IStudentInfoService {

    @Autowired
    private StudentInfoRepo repo;
    
    public List<StudentInfo> getAllStudentInfo() {
        return repo.findAll();
    }

    public StudentInfo saveStudentInfo(StudentInfo studentInfo) {
        return repo.save(studentInfo);
    }

    @Override
    public StudentInfo getStudentInfoById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> 
                    new NoSuchElementException("Student info not found with id "+id));
             
    }

    @Override
    public void deleteStudentInfoById(Long id) {
        repo.deleteById(id);
    }

}
