package com.internshala_ass.CarManagementSys.service;

import com.trainingmug.carmanagementsys.model.Car;
import com.trainingmug.carmanagementsys.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(int page, int size, String sortBy) {
        return carRepository.findAll(PageRequest.of(page, size, Sort.by(sortBy))).getContent();
    }

    public Car addCar(@Valid Car car) {
        return carRepository.save(car);
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public Car updateCar(Long id, Car carDetails) {
        Car car = carRepository.findById(id).orElseThrow();
        car.setCarName(carDetails.getCarName());
        car.setModel(carDetails.getModel());
        car.setYear(carDetails.getYear());
        car.setPrice(carDetails.getPrice());
        car.setColor(carDetails.getColor());
        car.setFuelType(carDetails.getFuelType());
        return carRepository.save(car);
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }

    public List<Car> searchCars(String carName, String model, Integer year, String color, String fuelType) {
        if (carName != null) {
            return carRepository.findByCarNameContainingIgnoreCase(carName);
        } else if (model != null) {
            return carRepository.findByModelContainingIgnoreCase(model);
        } else if (year != null) {
            return carRepository.findByYear(year);
        } else if (color != null) {
            return carRepository.findByColorContainingIgnoreCase(color);
        } else if (fuelType != null) {
            return carRepository.findByFuelTypeContainingIgnoreCase(fuelType);
        }
        return carRepository.findAll();
    }
}
