package com.communityvscovid.lpts.doctor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository repository;
	
	public Iterable<Doctor> getAll() {
		return repository.findAll();
	}
	
	public Optional<Doctor> get(Long id) {
		return repository.findById(id);
	}
	
	public Iterable<Doctor> add(List<Doctor> entities) {
		return repository.saveAll(entities);
	}
	
	public Doctor update(Doctor entity) {
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
