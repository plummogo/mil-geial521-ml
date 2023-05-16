package com.example.demo;

public class Cage {
    private Integer Id;
    private String CageNumber;
    private com.example.demo.ComponentType ComponentType;
    private com.example.demo.Ring ConnectedRing;

    public Cage(Integer Id, String CageNumber, com.example.demo.ComponentType ComponentType, com.example.demo.Ring ConnectedRing) {
        this.Id = Id;
        this.CageNumber = CageNumber;
        this.ComponentType = ComponentType;
        this.ConnectedRing = ConnectedRing;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCageNumber() {
        return CageNumber;
    }

    public void setCageNumber(String CageNumber) {
        this.CageNumber = CageNumber;
    }

    public com.example.demo.ComponentType getComponentType() {
        return ComponentType;
    }

    public void setComponentType(com.example.demo.ComponentType ComponentType) {
        this.ComponentType = ComponentType;
    }

    public com.example.demo.Ring getConnectedRing() {
        return ConnectedRing;
    }

    public void setConnectedRing(com.example.demo.Ring ConnectedRing) {
        this.ConnectedRing = ConnectedRing;
    }
}
