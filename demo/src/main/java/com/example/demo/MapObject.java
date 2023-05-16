package com.example.demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document
public class MapObject {
    @Id
    private Integer id;
    private String Description;
    private com.example.demo.Coordinates Coordinates;
    private List<Cage> Cages;
    private List<Buoy> Buoys;

    public MapObject(Integer id, String Description, Coordinates Coordinates, List<Cage> Cages, List<Buoy> Buoys) {
        this.id = id;
        this.Description = Description;
        this.Coordinates = Coordinates;
        this.Cages = Cages;
        this.Buoys = Buoys;
    }

    public Integer getId() { return id; }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Coordinates getCoordinates() {
        return Coordinates;
    }

    public void setCoordinates(Coordinates Coordinates) {
        this.Coordinates = Coordinates;
    }

    public List<Cage> getCages() {
        return Cages;
    }

    public void setCages(List<Cage> Cages) {
        this.Cages = Cages;
    }

    public List<Buoy> getBuoys() {
        return Buoys;
    }

    public void setBuoys(List<Buoy> Buoys) {
        this.Buoys = Buoys;
    }
}
