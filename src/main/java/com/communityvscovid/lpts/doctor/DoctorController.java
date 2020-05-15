package com.communityvscovid.lpts.doctor;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	@Autowired
	private DoctorService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/doctors")
	public Iterable<Doctor> getAll() {
		return service.getAll();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/doctors/{id}")
	public Optional<Doctor> get(@PathVariable Long id) {
		return service.get(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/doctors")
	public Iterable<Doctor> add(@RequestBody List<Doctor> entities) {
		return service.add(entities);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/doctors/{id}")
	public Doctor update(@RequestBody Doctor entity, @PathVariable Long id) {
		return service.update(entity);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/doctors/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
