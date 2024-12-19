package com.internshala_ass.CarManagementSys.controller;

import com.trainingmug.carmanagementsys.model.Car;
import com.trainingmug.carmanagementsys.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public Car addCar(@Valid @RequestBody Car car) {
        return carService.addCar(car);
    }

    @GetMapping
    public List<Car> getAllCars(@RequestParam(required = false) String carName,
                                 @RequestParam(required = false) String model,
                                 @RequestParam(required = false) Integer year,
                                 @RequestParam(required = false) String color,
                                 @RequestParam(required = false) String fuelType,
                                 @RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "10") int size,
                                 @RequestParam(defaultValue = "price") String sortBy) {
        return carService.searchCars(carName, model, year, color, fuelType);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable Long id, @Valid @RequestBody Car carDetails) {
        return carService.updateCar(id, carDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
    }
}
