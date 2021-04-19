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
    public List<Car> getCars() {
        return this.service.getCars();
    }

    //get single car with id
    @GetMapping("/cars/{carId}")
    public Car getCar(@PathVariable String carId){
        return this.service.getCar(Integer.parseInt(carId));
    }

    //add new car to the list
    @PostMapping("/cars")
    public Car addCar(@RequestBody Car car){
        return this.service.addCar(car);
    }

    //update the car
    @PutMapping("/cars")
    public Car updateCar(@RequestBody Car newCar){
        return this.service.updateCar(newCar);
    }

    //delete the car
    @DeleteMapping("/cars/{carId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String carId){
        try {
            this.service.deleteCourse(Integer.parseInt(carId));
            return new ResponseEntity<HttpStatus>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
