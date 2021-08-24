package com.tcs.fitnessspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

	@Autowired
	IAppointmentService appointmentService;

	@GetMapping("/getappointment")
	public String getAppointment() {
		System.out.println("Welcome");
		return "Appointment";
	}

	@PostMapping("/appointment")
	public void saveAppointment(@RequestBody Appointment appointment) {
		appointmentService.save(appointment);
		System.out.println(appointment.getDate());
		System.out.println(appointment.getName());
	}
}
