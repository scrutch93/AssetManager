package com.pluralsight;
import java.time.*;

public class Vehicle extends Asset {

    private String makeModel;

    private int year;

    private int odometer;


    public Vehicle(String description, String dateAquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAquired, originalCost);

        this.makeModel = makeModel;

        this.year = year;

        this.odometer = odometer;


    }

    public String getMakeModel() {
        return this.makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {

        Year thisYear = Year.now();
        int currentYear = Integer.parseInt(thisYear.toString());

        String makeModel = getMakeModel();
        int year = getYear();
        int yearDifference = currentYear - year;
        int odometer = getOdometer();
        double cost = getOriginalCost();


        if (yearDifference <= 3) {

            cost -= cost * 00.03 * yearDifference;


        } else if (4 == yearDifference || yearDifference == 6 || yearDifference == 5) {

            cost -= cost * 00.06 * yearDifference;
        } else if (7 == yearDifference || yearDifference == 8 || yearDifference == 9 || yearDifference == 10) {

            cost -= cost * 00.08 * yearDifference;

        } else if (yearDifference > 10) {

            cost -= 1000;
        }


        if (odometer > 100000) {

            cost -= cost * 00.25;

        } else if (makeModel.contains("Toyota") || makeModel.contains("Honda")) {

            return cost;

        }


        return cost;
    }
}