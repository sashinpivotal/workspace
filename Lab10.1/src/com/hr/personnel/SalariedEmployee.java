/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // class constants
    public static final double STANDARD_DEDUCTION = 10_000.0;

    // fields
    private double salary;

    // constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);   // delegate to neighboring ctor for name, hireDate
        setSalary(salary);      // handle salary here, by delegating to setter
    }

    // business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    @Override  // interface TaxPayer
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}