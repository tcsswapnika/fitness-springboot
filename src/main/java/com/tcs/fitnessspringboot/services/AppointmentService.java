package com.tcs.fitnessspringboot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.tcs.fitnessspringboot.entity.Appointment;
import com.tcs.fitnessspringboot.exceptions.AppointmentNotFoundException;
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

	@Override
	public Optional<Appointment> getAppointment(Integer id) {
		Optional<Appointment> appointment = appointmentRepository.findById(id);
		if (!appointment.isPresent()) {
			throw new AppointmentNotFoundException("Appointment does not exist");
		}
		return appointment;
	}

}
