package com.keyin.aircraft;

import com.keyin.airport.Airport;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aircraft {
    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue =1)
    @GeneratedValue(generator = "aircraft_sequence")
    private long id;

    private String tailnumber;

    private String type;

    private String brand;

    private String model;



    @ManyToMany
    private List<Airport> airports;

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getTailnumber() {return tailnumber;}

    public void setTailnumber(String tailnumber){this.tailnumber = tailnumber;}

    public String getType(){return type;}

    public void setType(String type){this.type = type;}

    public String getBrand() {return brand;}

    public void setBrand(String brand){this.brand = brand;}

    public String getModel(){return model;}

    public void setModel(String model) {this.model = model; }


}

