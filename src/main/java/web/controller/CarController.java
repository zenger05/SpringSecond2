package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String carView(ModelMap modelMap, @RequestParam(defaultValue = "5") int count) {
        CarService cars1 = new CarService();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("bmw", "x6", "black"));
        cars.add(new Car("mers", "a1", "black"));
        cars.add(new Car("audi", "r8", "orange"));
        cars.add(new Car("haval", "ki1", "red"));
        cars.add(new Car("lada", "priora", "white"));
        cars1.setCars(cars);
        List<Car> listCar = cars1.get(count);
        modelMap.addAttribute("cars", listCar);
        return "car";
    }
}
