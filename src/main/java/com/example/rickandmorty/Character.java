package com.example.rickandmorty;

import com.google.gson.annotations.SerializedName;

public class Character {
    //does not need serialized names because they are already lowercase in API docs

    @SerializedName("name")
    private String name;
    @SerializedName("image")
    private String image;
    @SerializedName("id")
    private String id;

    public Character(String name, String image, String id) {
        setName(name);
        setImage(image);
        setId(id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String toString (){
        return String.format("%s",name);
    }
}
