package com.tcs.fitnessspringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.fitnessspringboot.Appointment;
import com.tcs.fitnessspringboot.repository.IAppointmentRepository;

@Service
public class AppointmentService implements IAppointmentService {

	@Autowired
	IAppointmentRepository appointmentRepository;

	@Override
	public void save(Appointment appointment) {
		appointmentRepository.save(appointment);
		System.out.println("Appointment created");
	}

	@Override
	public Iterable<Appointment> getAllAppointment() {
		return appointmentRepository.findAll();
	}
}
