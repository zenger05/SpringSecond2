package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component("carService")
public class CarService {

    private List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("bmw", "x6", "black"));
        cars.add(new Car("mers", "a1", "black"));
        cars.add(new Car("audi", "r8", "orange"));
        cars.add(new Car("haval", "ki1", "red"));
        cars.add(new Car("lada", "priora", "white"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(Car car) {
        cars.add(car);
    }


    public List<Car> get(int count) {
        if (count >= 5){
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
