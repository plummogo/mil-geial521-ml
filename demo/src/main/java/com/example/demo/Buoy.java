package com.example.demo;

public class Buoy {
    private Integer Id;
    private String Description;
    private ComponentType ComponentType;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public com.example.demo.ComponentType getComponentType() {
        return ComponentType;
    }

    public void setComponentType(com.example.demo.ComponentType ComponentType) {
        this.ComponentType = ComponentType;
    }

    public Buoy(Integer Id, String Description, com.example.demo.ComponentType ComponentType) {
        this.Id = Id;
        this.Description = Description;
        this.ComponentType = ComponentType;
    }
}
