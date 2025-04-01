package com.code2learn.SpringBootReact.service;

import java.util.List;

import com.code2learn.SpringBootReact.model.StudentInfo;

public interface IStudentInfoService {
    public List<StudentInfo> getAllStudentInfo();
    public StudentInfo saveStudentInfo(StudentInfo studentInfo);
    public StudentInfo getStudentInfoById(Long id);
    public void deleteStudentInfoById(Long id);
}
