package com.internshala_ass.CarManagementSys.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String carName;

    @NotBlank
    private String model;

    @Positive
    private int year;

    @Positive
    private double price;

    private String color;

    private String fuelType; // Petrol, Diesel, Electric

    // Getters and Setters
}
