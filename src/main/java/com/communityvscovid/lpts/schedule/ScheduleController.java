package com.communityvscovid.lpts.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.communityvscovid.lpts.doctor.Doctor;


public class ScheduleController {
	@Autowired
	private ScheduleService service;
	
	@RequestMapping(method=RequestMethod.GET, value="doctors/{doctorId}/schedules")
	public Iterable<Schedule> getByDoctor(@PathVariable Long doctorId) {
		return service.getByDoctor(new Doctor(doctorId, null, null));
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="doctors/{doctorId}/schedules")
	public Iterable<Schedule> update(@RequestBody List<Schedule> entities, @PathVariable Long id) {
		return service.update(entities);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="doctors/{doctorId}/schedules/")
	public void delete(@PathVariable Long doctorId) {
		service.deleteByDoctorId(new Doctor(doctorId, null, null));
	}
}
