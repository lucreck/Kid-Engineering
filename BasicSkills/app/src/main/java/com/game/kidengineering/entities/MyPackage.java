package com.game.kidengineering.entities;

/**
 * Created by vanhai on 7/20/2015.
 */
public class MyPackage {
    String name, imageName;
    int id;
    boolean available;

    public MyPackage() {
    }

    public MyPackage(int id, String name, String imageName, boolean available) {
        this.name = name;
        this.imageName = imageName;
        this.id = id;
        this.available = available;
    }

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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
