package com.riyan.ridehailing.controller;

import com.riyan.ridehailing.model.Ride;
import com.riyan.ridehailing.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rides")
public class RideController {

    @Autowired
    private RideRepository rideRepository;

    @PostMapping("/request")
    public ResponseEntity<Ride> requestRide(@RequestBody Ride rideRequest) {
        Ride ride = new Ride(
            rideRequest.getUserId(),
            rideRequest.getPickup(),
            rideRequest.getDestination()
        );
        return ResponseEntity.ok(rideRepository.save(ride));
    }
}
