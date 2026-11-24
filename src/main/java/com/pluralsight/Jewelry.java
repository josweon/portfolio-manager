package com.pluralsight;

public class Jewerly extends Asset{
    private double karat;
    public static double priceKarat = 10_000;

    public Jewerly(String name, double karat) {
        super(name, karat * priceKarat);
        this.karat = karat;
    }
}
