package com.riyan.ridehailing.repository;

import com.riyan.ridehailing.model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride, Long> {
}
