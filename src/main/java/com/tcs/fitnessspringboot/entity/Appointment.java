package com.tcs.fitnessspringboot.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Date date;

	@NotBlank(message = "Name is Mandatory")
	private String name;

	
	private Long phone;

	@Email
	@NotBlank(message = "Email is Mandatory")
	private String email;

	private String trainer;
	private Integer pack;
	private String address;
	private String gender;

}
