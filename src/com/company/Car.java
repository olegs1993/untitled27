package com.company;

/**
 * Created by Oleg on 21.04.2017.
 */
public class Car {
    private final int id;
    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final int price;
    private final int regNumber;

    public static class Builder {
        private int id = 0;
        private final String make;
        private final String model;
        private final int year;
        private String color = "Black";
        private final int price;
        private int regNumber = 0;

        public Builder(String make, String model, int year, int price) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder regNumber(int regNumber) {
            this.regNumber = regNumber;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    private Car(Builder builder) {
        id = builder.id;
        make = builder.make;
        model = builder.model;
        year = builder.year;
        color = builder.color;
        price = builder.price;
        regNumber = builder.regNumber;
    }

    public int getId() {
        return id;
    }


    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }


    public int getYear() {
        return year;
    }


    public String getColor() {
        return color;
    }


    public int getPrice() {
        return price;
    }


    public int getRegNumber() {
        return regNumber;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", regNumber=" + regNumber +
                '}';
    }
}
