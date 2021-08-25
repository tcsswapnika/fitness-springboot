package com.tcs.fitnessspringboot.services;

import com.tcs.fitnessspringboot.Appointment;

public interface IAppointmentService {
	void save(Appointment appointment);

	Iterable<Appointment> getAllAppointment();

	void deleteAppointment(Integer id);

	void update(Appointment appointment, Integer id);

}
