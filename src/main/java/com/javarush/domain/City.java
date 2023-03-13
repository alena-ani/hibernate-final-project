package com.javarush.domain;

import jakarta.persistence.*;

@Entity
@Table(schema = "world", name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String district;

    private Integer population;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public String getDistrict() {
        return district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }
}
