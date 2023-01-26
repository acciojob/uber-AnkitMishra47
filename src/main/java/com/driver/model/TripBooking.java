package com.driver.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int tripBookingId;

    TripStatus status ;

    int bill ;

    Customer customer;

    Driver driver;

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    int distanceInKm ;
    String fromLocation ;

    String toLocation;


    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public int getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public TripBooking(TripStatus status, Customer customer, Driver driver, int distanceInKm, String fromLocation, String toLocation) {
        this.status = status;
        this.customer = customer;
        this.driver = driver;
        this.distanceInKm = distanceInKm;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }

    public TripBooking(int tripBookingId, int distanceInKm, String fromLocation, String toLocation) {
        this.tripBookingId = tripBookingId;
        this.distanceInKm = distanceInKm;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
    }
}