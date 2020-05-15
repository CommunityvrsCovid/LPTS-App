package com.communityvscovid.lpts.department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/departments")
	public Iterable<Department> getAll() {
		return service.getAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/departments/{id}")
	public Optional<Department> get(@PathVariable Long id) {
		return service.get(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/departments")
	public Iterable<Department> add(@RequestBody List<Department> entities) {
		return service.add(entities);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/departments/{id}")
	public Department update(@RequestBody Department entity, @PathVariable Long id) {
		return service.update(entity);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/departments/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
