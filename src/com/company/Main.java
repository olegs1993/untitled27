package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<Car>();

        list.add(new Car.Builder("BMW", "X6", 2005, 120000).build());
        list.add(new Car.Builder("BMW", "X6", 2015, 12000011).build());
        list.add(new Car.Builder("Mersedec", "Benz", 2010, 100000).build());
        list.add(new Car.Builder("Bugatti", "Veron", 2005, 200000).build());
        list.add(new Car.Builder("Bugatti", "Veron", 2015, 200111).build());

        ListOfCars listOfCars = new ListOfCars();
        for (Car car : listOfCars.getListOfMake(list, "BMW")) {
            System.out.println(car);
        }
        System.out.println();
        for (Car car : listOfCars.getListOfAge(list, "BMW", 6)) {
            System.out.println(car);
        }
        System.out.println();
        for (Car car : listOfCars.getListOfYearPrice(list, 2005, 50000)) {
            System.out.println(car);
        }
    }
}
