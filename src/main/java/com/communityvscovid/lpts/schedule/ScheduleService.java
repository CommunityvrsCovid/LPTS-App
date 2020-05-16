package com.communityvscovid.lpts.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.communityvscovid.lpts.doctor.Doctor;



@Service
public class ScheduleService {
	@Autowired
	private ScheduleRepository repository;
	
	public Iterable<Schedule> getByDoctor(Doctor doctor) {
		return repository.findAllByDoctorId(doctor);
	}
	
	public Iterable<Schedule> update(List<Schedule> entities) {
		return repository.saveAll(entities);
	}
	
	public void deleteByDoctorId(Doctor doctor) {
		repository.deleteByDoctorId(doctor);
	}
}
