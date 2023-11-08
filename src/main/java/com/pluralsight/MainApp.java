package com.pluralsight;
import  java.time.*;

public class MainApp {
    public static void main(String[] args) {

        House house = new House("2 Story House", "10/12/2023", 20000.00, "1234 Awesome drive", 2, 2000, 8000);


        Double OverallValue = house.getValue();


        Vehicle car = new Vehicle("Personal car", "9/11/2022", 4000, "Toyota Camry", 2019, 150000);

        System.out.println(car.getValue());

    }
}
