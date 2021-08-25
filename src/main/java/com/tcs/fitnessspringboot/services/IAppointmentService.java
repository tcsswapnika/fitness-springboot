package com.tcs.fitnessspringboot.services;

import java.util.Optional;

import com.tcs.fitnessspringboot.Appointment;

public interface IAppointmentService {
	void save(Appointment appointment);

	Iterable<Appointment> getAllAppointment();

	Optional<Appointment> getAppointment(Integer id);

	void deleteAppointment(Integer id);

	void update(Appointment appointment, Integer id);

}
