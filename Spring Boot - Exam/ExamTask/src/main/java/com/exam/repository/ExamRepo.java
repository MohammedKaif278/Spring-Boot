package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.Exam;

public interface ExamRepo extends JpaRepository<Exam, Long>{

}
