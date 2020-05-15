package com.communityvscovid.lpts.department;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository repository;
	
	public Iterable<Department> getAll() {
		return repository.findAll();
	}
	
	public Optional<Department> get(Long id) {
		return repository.findById(id);
	}
	
	public Iterable<Department> add(List<Department> entities) {
		return repository.saveAll(entities);
	}
	
	public Department update(Department entity) {
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
