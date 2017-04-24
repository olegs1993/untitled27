package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by p on 04/21/2017.
 */
public class ListOfCars {

    public List<Car> getListOfMake(List<Car> cars, String make) {
        List<Car> carsOfMake = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMake().equals(make))
                carsOfMake.add(car);
        }
        return carsOfMake;
    }

    public List<Car> getListOfAge(List<Car> cars, String make, int age) {
        List<Car> carsOfAge = new ArrayList<>();

        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        int year = cal.get(Calendar.YEAR);

        for (Car car : getListOfMake(cars, make)) {
            if (year - car.getYear() > age)
                carsOfAge.add(car);
        }
        return carsOfAge;
    }

    public List<Car> getListOfYearPrice(List<Car> cars, int year, int price) {
        List<Car> carsOfYearPrice = new ArrayList<>();

        for (Car car : cars) {
            if (year == car.getYear() && car.getPrice() > price)
                carsOfYearPrice.add(car);
        }
        return carsOfYearPrice;
    }


}