package com.evoke.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evoke.entity.Book;
import com.evoke.entity.Student;
import com.evoke.repo.BookRepo;
import com.evoke.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo sRepo;
	
	@Autowired
	private BookRepo bRepo;

	public Student save(Student stu) {
		Book b1 = new Book("JAVA");
		Book b2 = new Book("DOT NET");
		
		List<Book> list = new ArrayList<>();
		list.add(b1);
		list.add(b2);
		
		bRepo.saveAll(list);
		
		stu.setBooks_issued(list);
		return sRepo.save(stu);
	}

	public Student find(Integer id) {
		return sRepo.findById(id).orElseThrow();
	}
	
}
