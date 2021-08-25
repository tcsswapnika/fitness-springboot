package com.tcs.fitnessspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.fitnessspringboot.Appointment;
import com.tcs.fitnessspringboot.exceptions.AppointmentNotFoundException;
import com.tcs.fitnessspringboot.services.IAppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	IAppointmentService appointmentService;

	@GetMapping
	public String getAppointment() {
		System.out.println("Welcome");
		return "Appointment";
	}

	@GetMapping("/{id}")
	private Iterable<Appointment> getAppointment(@PathVariable("id") Integer id) {
		return appointmentService.getAllAppointment();
	}
	
	@ExceptionHandler(value = AppointmentNotFoundException.class)
	public ResponseEntity<Appointment> exception(AppointmentNotFoundException appointmentNotFoundException){
		return new ResponseEntity<Appointment>(HttpStatus.NOT_FOUND);
		
	}

	@PostMapping
	public void saveAppointment(@RequestBody Appointment appointment) {
		appointmentService.save(appointment);
		System.out.println(appointment.getDate());
		System.out.println(appointment.getName());
	}

}
