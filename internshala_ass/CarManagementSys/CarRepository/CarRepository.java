package com.internshala_ass.CarManagementSys.CarRepository;

import com.internshala_ass.CarManagementSys.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByCarNameContainingIgnoreCase(String carName);
    List<Car> findByModelContainingIgnoreCase(String model);
    List<Car> findByYear(int year);
    List<Car> findByColorContainingIgnoreCase(String color);
    List<Car> findByFuelTypeContainingIgnoreCase(String fuelType);
}
