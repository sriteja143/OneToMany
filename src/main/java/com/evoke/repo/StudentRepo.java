package com.evoke.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evoke.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
