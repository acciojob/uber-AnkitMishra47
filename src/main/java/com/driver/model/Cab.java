package com.driver.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    int perKmRate;

    boolean isAvailable;

    Driver driver;

    public Cab(int perKmRate, boolean isAvailable, Driver driver) {
        this.perKmRate = perKmRate;
        this.isAvailable = isAvailable;
        this.driver = driver;
    }

    public Cab(int id, int perKmRate, boolean isAvailable, Driver driver) {
        this.id = id;
        this.perKmRate = perKmRate;
        this.isAvailable = isAvailable;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public Cab() {
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}