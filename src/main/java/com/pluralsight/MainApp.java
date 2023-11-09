package com.pluralsight;
import  java.time.*;
import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {

        ArrayList<Asset> MyAssets = new ArrayList<>();

        MyAssets.add(new House("2 Story House", "10/12/2023", 20000.00, "1234 Awesome drive", 2, 2000, 8000));
        MyAssets.add(new House("Mansion", "12/23/2020", 10000000, "999 Million Dollar Drive",1, 10000,20000));
        MyAssets.add(new Vehicle("Personal car", "9/11/2022", 4000, "Toyota Camry", 2019, 150000));
        MyAssets.add(new Vehicle("Pimped out ride", "2/15/2006", 60000, "Chevy Corvette", 1950, 180000));

        for (Asset x:MyAssets) {

            System.out.printf("\n I acquired my %s on %s. I originally paid %.2f and it is now worth %.2f",x.getDescription(),x.getDateAquired(),x.getOriginalCost(), x.getValue());

            if (x instanceof House){

                System.out.printf("\n The address is %s", ((House) x).getAddress());

            } else if (x instanceof  Vehicle){
                System.out.printf("\n The make/Model is %s", ((Vehicle) x).getMakeModel());

            }


        }




    }
}
