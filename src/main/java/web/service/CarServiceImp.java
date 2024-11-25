package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {


    private List<Car> cars = new ArrayList<>();
    public List<Car> list = new ArrayList<>();

    public CarServiceImp(List<Car> list) {
        this.list = list;
    }


    public  List<Car> getCars() {
        cars.add(new Car("Haval", "Black", 2022));
        cars.add(new Car("Lifan", "White", 2024));
        cars.add(new Car("Cherry", "Pink", 2023));
        cars.add(new Car("Geely", "Red", 2022));
        cars.add(new Car("BMW", "Blue", 2021));
        return cars;
    }

    public List<Car> getCarsByCount(int number) {
        list = getCars();
        if (number == 0 || number > 5) {
            return getCars();
        }
        return list.stream().limit(number).collect(Collectors.toList());
    }

}
