package com.riyan.ridehailing.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rides")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String pickup;
    private String destination;
    private LocalDateTime requestTime;
    private String status;

    public Ride() {}

    public Ride(Long userId, String pickup, String destination) {
        this.userId = userId;
        this.pickup = pickup;
        this.destination = destination;
        this.requestTime = LocalDateTime.now();
        this.status = "PENDING";
    }

    // Getters and Setters below
    public Long getId() { return id; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getPickup() { return pickup; }
    public void setPickup(String pickup) { this.pickup = pickup; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public LocalDateTime getRequestTime() { return requestTime; }
    public void setRequestTime(LocalDateTime requestTime) { this.requestTime = requestTime; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
