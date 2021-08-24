package com.tcs.fitnessspringboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepository extends CrudRepository<Appointment, Integer> {

}
