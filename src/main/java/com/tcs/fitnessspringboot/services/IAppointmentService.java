package com.tcs.fitnessspringboot.services;

import com.tcs.fitnessspringboot.Appointment;

public interface IAppointmentService {
	void save(Appointment appointment);
	
	Iterable<Appointment> getAllAppointment();

}
