package com.example.mapper;

import java.util.List;

import com.example.model.Author;

public interface AuthorMapper {
	List<Author> findAllAuthors();
	Author findOneAuthor(int id);
	int insertAuthor(Author author);
	int deleteAuthor(int id);
	
	
}
