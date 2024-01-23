package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public CarService() {
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> car) {
        cars.addAll(car);
    }

    public List<Car> get(int count) {
        if (count >= 5){
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
