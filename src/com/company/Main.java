package com.company;

public class Main {

    public static void main(String[] args) {

        Airplane airplane = new Airplane("Airbus", 300);
        airplane.getBrand();
        airplane.setNumberOfSeats(400);
        airplane.getProductionYear();

        airplane.isEngineEcological();


    }
}
