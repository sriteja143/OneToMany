package com.evoke.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.evoke.entity.Book;
import com.evoke.entity.Student;
import com.evoke.repo.BookRepo;
import com.evoke.repo.StudentRepo;
import com.evoke.service.StudentService;

@RestController
public class StudentController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private StudentService service;
	
	@PostMapping
	public Student save(@RequestBody Student stu) {
		logger.debug("Entered in Save method :: {}",stu );
		
		return service.save(stu);
		
	}
	
	@GetMapping
	public Student save(@RequestParam Integer id) {
		logger.debug("Entered in Fetch method " );
		
		return service.find(id);
		
	}
	
	
}
