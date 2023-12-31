package com.FlightReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightReservation.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
	

}
