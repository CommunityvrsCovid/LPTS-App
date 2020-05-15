package com.communityvscovid.lpts.token;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {
	@Autowired
	private TokenService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/tokens")
	public Iterable<Token> getAll() {
		return service.getAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/tokens/{id}")
	public Optional<Token> get(@PathVariable Long id) {
		return service.get(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/tokens")
	public Iterable<Token> add(@RequestBody List<Token> entities) {
		return service.add(entities);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/tokens/{id}")
	public Token update(@RequestBody Token entity, @PathVariable Long id) {
		return service.update(entity);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/tokens/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
