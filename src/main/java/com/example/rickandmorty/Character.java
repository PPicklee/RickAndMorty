package com.example.rickandmorty;

import com.google.gson.annotations.SerializedName;

public class Character {
    @SerializedName("Id")
    private String id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Status")
    private String status;
    @SerializedName("Species")
    private String species;
    @SerializedName("Type")
    private String type;
    @SerializedName("Gender")
    private String gender;
    @SerializedName("Image")
    private String image;

    public Character(String id, String name, String status, String species, String type, String gender, String image) {
        setId(id);
        setName(name);
        setStatus(status);
        setSpecies(species);
        setType(type);
        setGender(gender);
        setImage(image);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String toString (){
        return String.format("%s-%s",name,gender);
    }
}
