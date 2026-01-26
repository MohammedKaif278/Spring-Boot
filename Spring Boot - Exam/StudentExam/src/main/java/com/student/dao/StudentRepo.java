package com.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentExam;

@Repository
public interface StudentRepo extends JpaRepository<StudentExam, Long>{

}
