package com.communityvscovid.lpts.schedule;

import org.springframework.data.repository.CrudRepository;

import com.communityvscovid.lpts.doctor.Doctor;

public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
	Iterable<Schedule> findAllByDoctorId(Doctor doctor);
	void deleteByDoctorId(Doctor doctor);
}
