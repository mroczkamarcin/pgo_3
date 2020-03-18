package com.company;

public class Airplane {

    private String brand;
    private int numberOfSeats;
    Engine engine = new Engine(30000, 2004);


    public Airplane(String brand, int NumberOfSeats) {
        this.brand = brand;
        this.numberOfSeats = numberOfSeats;

    }

    public String getBrand() {
        return brand;
    }

    public double getPower() {
        return engine.getPower();
    }

    public double getProductionYear() {
        return engine.getProductionYear();
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }


    void isEngineEcological() {

        boolean isEngineEcological;

        if (engine.getPower() > 20000 && engine.getProductionYear() > 2000) {

            isEngineEcological = true;
            System.out.println("the engine is ecological");
        } else {
            isEngineEcological = false;
            System.out.println("the engine is not ecological");
        }
    }

}


