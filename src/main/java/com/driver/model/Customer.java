package com.driver.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int customerId;
    String mobile ;
    String password;

    List<TripBooking> tripBookingList;

    public int getCustomerId() {
        return customerId;
    }

    public Customer() {
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List tripBookingList) {
        this.tripBookingList = tripBookingList;
    }

    public Customer(int customerId, String mobile, String password, List<TripBooking> tripBookingList) {
        this.customerId = customerId;
        this.mobile = mobile;
        this.password = password;
        this.tripBookingList = tripBookingList;
    }

    public Customer(int customerId, String mobile, String password) {
        this.customerId = customerId;
        this.mobile = mobile;
        this.password = password;
    }
}