package com.comics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comics.repository.ComicsFeignRepository;

@RestController
@RequestMapping(value = "/comics")
public class ComicController {
	
	
	@Autowired
	private ComicsFeignRepository repository;
	
	@GetMapping
	public ResponseEntity<Object> FindAll(){
		return ResponseEntity.ok(repository.getComics());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> FindById(@PathVariable long id){
		return ResponseEntity.ok(repository.getComicById(id));
	}
}
