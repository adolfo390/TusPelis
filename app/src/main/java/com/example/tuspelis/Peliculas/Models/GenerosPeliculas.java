package com.example.tuspelis.Peliculas.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GenerosPeliculas {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
