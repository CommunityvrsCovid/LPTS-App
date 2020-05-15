package com.communityvscovid.lpts.appointment;

import javax.persistence.Entity;

import com.communityvscovid.lpts.schedule.Schedule;
import com.communityvscovid.lpts.token.Token;

@Entity
public class Appointment {
	private Schedule slot;
	private Token token;

	public Schedule getSlot() {
		return slot;
	}

	public void setSlot(Schedule slot) {
		this.slot = slot;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}
}
