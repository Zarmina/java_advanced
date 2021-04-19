package nl.inholland.carshowroom.service;

import nl.inholland.carshowroom.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    private List<Car> carslist;

    public CarService()
    {
        this.carslist = new ArrayList<>();
                carslist.add(new Car(1,"Tesla", "black", 25.000, "S"));
                carslist.add(new Car(2,"Tesla", "white", 46.000, "X"));
                carslist.add(new Car(3,"Tesla", "Navy Blue", 65.000, "Y"));
                carslist.add(new Car(4,"Audi", "black", 117.516, "RS e-tron GT 2022"));
                carslist.add(new Car(5,"Audi", "white", 58.321, "E-tron Sportback Premium Plus 2021"));
                carslist.add( new Car(6,"Audi", "red", 130.116, "R8 Spyder 2021"));
                carslist.add( new Car(7,"Ferrari", "red", 235.200, "F8 Tributo 2021"));
                carslist.add(new Car(8,"Ferrari", "brown", 305.533, "812 GTS 2020"));
                carslist.add(new Car(9,"Ferrari", "gray", 250.320, "GTC4 Lusso 2020"));
                carslist.add(new Car(10,"Ferrari", "blue", 280.896, "488 Spider 2019"));
    }
    public List<Car> getCars() {
        return carslist;
    }
    public Car getCar(long carId) {
        Car c = null;
        for (Car car:carslist) {
            if (car.getId() == carId) {
                c = car;
                break;
            } }
        return  c;
    }

    public Car addCar(Car car) {
        this.carslist.add(car);
        return car;
    }

    public Car updateCar(Car newCar) {
        for (Car car:carslist) {
            if (car.getId() == newCar.getId()) {
                car.setCompany(newCar.getCompany());
                car.setColor(newCar.getColor());
                car.setPrice(newCar.getPrice());
                car.setModel(newCar.getModel());
            }
        }
        return newCar;
    }

    public void deleteCourse(long carId){
        carslist = this.carslist.stream().filter(e->e.getId()!=carId).collect(Collectors.toList());
    }
}
