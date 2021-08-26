package com.tcs.fitnessspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.fitnessspringboot.entity.Appointment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepository extends CrudRepository<Appointment, Integer> {

}
