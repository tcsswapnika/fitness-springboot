package com.tcs.fitnessspringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

	@Override
	public void deleteAppointment(Integer id) {
		appointmentRepository.deleteById(id);
	}

	@Override
	public void update(Appointment appointment, Integer id) {
		Optional<Appointment> appointmentFromDB = appointmentRepository.findById(id);
		Appointment appointment1 = appointmentFromDB.get();
		if (StringUtils.hasText(appointment.getName()))
			appointment1.setName(appointment.getName());
		appointmentRepository.save(appointment1);
	}

}
