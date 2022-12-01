package com.example.rickandmorty;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

public class APIResponse {
    @SerializedName("Results")
    private Character[] results;

    public APIResponse(Character[] results) {
        setResults(results);
    }

    public Character[] getResults() {
        return results;
    }

    public void setResults(Character[] results) {
        this.results = results;
    }

    public List<Character> getCharacter(){return Arrays.asList(results);}

}
