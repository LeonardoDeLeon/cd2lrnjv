package com.code2learn.SpringBootReact.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code2learn.SpringBootReact.model.StudentInfo;

public interface StudentInfoRepo extends JpaRepository<StudentInfo, Long> {

}
