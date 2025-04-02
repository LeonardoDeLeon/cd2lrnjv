package com.code2learn.SpringBootReact.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping("/updateStudent/{id}")
    public ResponseEntity<StudentInfo> updateStudentInfo(
        @PathVariable Long id,
        @RequestBody StudentInfo studentInfo
    )
    {
        StudentInfo si=service.getStudentInfoById(id);
        si.setName(studentInfo.getName());
        si.setAddress(studentInfo.getAddress());
        si.setClassName(studentInfo.getClassName());
        si.setEmail(studentInfo.getEmail());
        si.setFathersName(studentInfo.getFathersName());
        si.setPhoneNumber(studentInfo.getPhoneNumber());

        return ResponseEntity.ok(service.updateStudentInfo(si));
    }
    
    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<StudentInfo> deleteStudentInfoById(@PathVariable Long id) {
        service.deleteStudentInfoById(id);
        return ResponseEntity.noContent().build();
    }


}
