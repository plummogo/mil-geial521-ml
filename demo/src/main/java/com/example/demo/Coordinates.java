package com.example.demo;

public class Coordinates {
    private Integer Id;
    private double X;
    private double Y;
    private String Format;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String Format) {
        this.Format = Format;
    }

    public Coordinates(Integer Id, double X, double Y, String Format) {
        this.Id = Id;
        this.X = X;
        this.Y = Y;
        this.Format = Format;
    }
}
