package com.company;

public class Engine
{
    private double power;
    private int productionYear;


    public Engine(double power, int productionYear) {
        this.power = power;
        this.productionYear = productionYear;
        ;

    }

    public double getPower() {
        return power;
    }

    public int getProductionYear() {
        return productionYear;
    }



}
