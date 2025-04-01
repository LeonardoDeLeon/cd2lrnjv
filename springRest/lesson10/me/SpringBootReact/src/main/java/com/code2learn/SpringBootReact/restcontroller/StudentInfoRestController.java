package com.code2learn.SpringBootReact.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.code2learn.SpringBootReact.model.StudentInfo;
import com.code2learn.SpringBootReact.service.IStudentInfoService;

@RestController
public class StudentInfoRestController {

    @Autowired
    private IStudentInfoService service;

    @GetMapping("/students")
    public List<StudentInfo> fetchStudentInfo() {
        return service.getAllStudentInfo();
    }

    @PostMapping("/student")
    public StudentInfo registerStudentInfo(@RequestBody StudentInfo studentInfo) {
        return service.saveStudentInfo(studentInfo);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<StudentInfo> getStudentInfoById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getStudentInfoById(id));
    }

    @GetMapping("/deleteStudent/{id}")
    public void deleteStudentInfoById(@PathVariable Long id) {
        service.deleteStudentInfoById(id);
    }
}
