package com.pluralsight;

public class House extends Asset {

    private String address;

    private int condition;

    private int squareFoot;

    private int lotSize;


    public House(String description, String dateAquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return this.condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return this.squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return this.lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }


    @Override
    public double getValue() {

        //double cost = getOriginalCost();
        int condition = getCondition();
        int SqFt = getSquareFoot();
        int lotSize = getLotSize();


        if (condition == 1) {

            return SqFt * 180.00 + lotSize * 00.25;


        } else if (condition == 2) {

            return SqFt * 130.00 + lotSize * 00.25;

        } else if (condition == 3) {

            return SqFt * 90.00 + lotSize * 00.25;

        } else if (condition == 4) {

            return SqFt * 80.00 + lotSize * 00.25;

        } else

            return 0;

    }
}