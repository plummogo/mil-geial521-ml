package com.example.demo;

public class Ring {
    private Integer Id;
    private String SerialNumber;
    private com.example.demo.ComponentType ComponentType;
    private double Radius;
    private Integer ConnectedCageId;

    public Ring(Integer Id, String SerialNumber, com.example.demo.ComponentType ComponentType, double Radius, Integer ConnectedCageId) {
        this.Id = Id;
        this.SerialNumber = SerialNumber;
        this.ComponentType = ComponentType;
        this.Radius = Radius;
        this.ConnectedCageId = ConnectedCageId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public com.example.demo.ComponentType getComponentType() {
        return ComponentType;
    }

    public void setComponentType(com.example.demo.ComponentType ComponentType) {
        this.ComponentType = ComponentType;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

    public Integer getConnectedCageId() {
        return ConnectedCageId;
    }

    public void setConnectedCageId(Integer ConnectedCageId) {
        this.ConnectedCageId = ConnectedCageId;
    }
}
