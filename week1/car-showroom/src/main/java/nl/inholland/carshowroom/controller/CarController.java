package nl.inholland.carshowroom.controller;

import nl.inholland.carshowroom.model.Car;
import nl.inholland.carshowroom.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService service;

    //get list of cars
    @GetMapping(value = "/cars", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Car>> getCars() {
        return  ResponseEntity.status(200).body(this.service.getCars());
    }

    //get single car with id
    @GetMapping("/cars/{carId}")
    public ResponseEntity<Car> getCar(@PathVariable String carId){
        return  ResponseEntity.status(200).body(this.service.getCar(Long.parseLong(carId)));
    }

    //add/create new car to the list
    @PostMapping("/cars")
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        return  ResponseEntity.status(201).body(this.service.addCar(car));
    }

    //update the car
    @PutMapping("/cars")
    public ResponseEntity<Car> updateCar(@RequestBody Car newCar){
        return  ResponseEntity.status(202).body(this.service.updateCar(newCar));
    }

    //delete the car
    @DeleteMapping("/cars/{carId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String carId){
        try {
            this.service.deleteCourse(Long.parseLong(carId));
            return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);
        }
    }
}
