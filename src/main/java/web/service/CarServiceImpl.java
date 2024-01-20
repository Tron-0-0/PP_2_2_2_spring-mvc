package web.service;

import web.models.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> CARS = List.of(
            new Car("Toyota Silvia", 23423432, 1997),
            new Car("Toyota Camry", 324234, 2013),
            new Car("Land Cruiser", 213214, 2019),
            new Car("Lada Vesta", 324234, 2023),
            new Car("Lada 2106", 213432, 2004)
    );

    @Override
    public List<Car> getCars() {
        return CARS;
    }

    @Override
    public List<Car> getCars(Integer count) {
        return (count > CARS.size()) ? CARS : CARS.subList(0, count);
    }

}
