package com.communityvscovid.lpts.token;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class TokenService {
	@Autowired
	private TokenRepository repository;
	
	public Iterable<Token> getAll() {
		return repository.findAll();
	}
	
	public Optional<Token> get(Long id) {
		return repository.findById(id);
	}
	
	public Iterable<Token> add(List<Token> entities) {
		return repository.saveAll(entities);
	}
	
	public Token update(Token entity) {
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
