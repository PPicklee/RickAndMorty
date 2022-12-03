package com.example.rickandmorty;

import com.google.gson.annotations.SerializedName;

public class CharacterDetails {
    //does not need serialized names because they are already lowercase in API docs
    @SerializedName("name")
    private String name;
    @SerializedName("status")
    private String status;
    @SerializedName("species")
    private String species;
    @SerializedName("type")
    private String type;
    @SerializedName("gender")
    private String gender;
    @SerializedName("image")
    private String image;
    @SerializedName("id")
    private String id;

    public CharacterDetails(String id, String name, String status, String species, String type, String gender, String image) {
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
}
