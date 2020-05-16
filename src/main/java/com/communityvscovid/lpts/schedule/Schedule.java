package com.communityvscovid.lpts.schedule;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.communityvscovid.lpts.doctor.Doctor;

@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Doctor doctor;
	private Integer day;
	private Date startTime;
	private Date endTime;
	private Integer noOfAppointmentsAllowed;

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getNoOfAppointmentsAllowed() {
		return noOfAppointmentsAllowed;
	}

	public void setNoOfAppointmentsAllowed(Integer noOfAppointmentsAllowed) {
		this.noOfAppointmentsAllowed = noOfAppointmentsAllowed;
	}

}
