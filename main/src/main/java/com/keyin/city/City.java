package com.keyin.city;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class City {
    @Id
    @SequenceGenerator(name = "city_sequence", sequenceName = "city_sequence", allocationSize = 1, initialValue =1)
    @GeneratedValue(generator = "city_sequence")
    private long id;

    private String name;

    public long getId() {return id;}

    public void setId(long id){this.id = id;}

    public String getname() {return name; }

    public void setName(String name) {this.name =name;}
}