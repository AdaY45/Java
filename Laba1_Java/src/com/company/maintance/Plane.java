package com.company.maintance;

import com.company.construction.*;

import java.util.List;

public abstract class Plane{
    private String model;
    private String manufacturer;
    private String status;
    private String cost;
    Material material;
    private String[] tailBase;
    private String rudder;
    private String elevators;
    private int size;
    private int weight;
    private int speed;

    Plane(String model,String manufacturer,String status,String cost,Material material,int speed) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.status = status;
        this.cost = cost;
        this.material = material;
        this.speed = speed;
    }
    public abstract void AircraftConstruction() throws ConstructionIsNotFinishedException;

    public abstract void AircraftInfo();

    public String[] tailBase(Stabilizer stb) {
        if(stb.getType() == "vertical") {
            tailBase = addBase(stb.stabilizerInfo(),rudder);
        } else {
            tailBase = addBase(stb.stabilizerInfo(),elevators);
        }
        return tailBase;
    }

    public String[] addBase(String[] stb, String attach) {
        String[] base = new String[stb.length+1];
        for(int i = 0; i < stb.length; i++) {
            base[i] = stb[i];
        }
        base[stb.length] = attach;

        return base;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getStatus() {
        return status;
    }

    public String getCost() {
        return cost;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMaterial() {
        return material.toString();
    }

}
