package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Model S", "Tesla", 2020));
        cars.add(new Car("Civic", "Honda", 2019));
        cars.add(new Car("Mustang", "Ford", 2018));
        cars.add(new Car("Camry", "Toyota", 2021));
        cars.add(new Car("3 Series", "BMW", 2017));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
