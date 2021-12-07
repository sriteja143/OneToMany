package com.evoke.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor	
@ToString
public class Book {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)  
	private Long id;
	private String bookName;
	
	public Book(String name) {
		this.bookName= name;
	}

}
