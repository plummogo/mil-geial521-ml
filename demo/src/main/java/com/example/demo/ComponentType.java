package com.example.demo;

public class ComponentType {
    private Integer Id;
    private String Type;

    public ComponentType(Integer Id, String Type) {
        this.Id = Id;
        this.Type = Type;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
}
