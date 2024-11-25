package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp {

    private List<Car> cars = new ArrayList<>();

    public  List<Car> getCars() {
        cars.add(new Car("Haval", "Black", 2022));
        cars.add(new Car("Lifan", "White", 2024));
        cars.add(new Car("Cherry", "Pink", 2023));
        cars.add(new Car("Geely", "Red", 2022));
        cars.add(new Car("BMW", "Blue", 2021));
        return cars;
    }
    public static List<Car> carsCount(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }

}
