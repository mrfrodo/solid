package com.example.demo;

/**
 * This class violates SRP.
 * It has more than one responsibility
 * It has more than one reason to change
 *
 * Do not put functions that change for different reasons in the same class
 *
 */
public class EmployeeV1 {

    public void calcPay() {

    }

    public void reportHours() {

    }

    public void writeEmployee() {

    }
}
