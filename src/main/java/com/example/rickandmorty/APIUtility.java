package com.example.rickandmorty;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class APIUtility {

    /**
     * Method reads Json file and creates APIResponse
     */
    public static APIResponse getCharacterFromJsonFile()
    {
        //create a GSON
        Gson gson = new Gson();
        APIResponse apiResponse = null;
        //try with resource
        try(
                FileReader fileReader = new FileReader("jsonData.json");
                JsonReader jsonReader = new JsonReader(fileReader);)
        {
            apiResponse = gson.fromJson(jsonReader, APIResponse.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return apiResponse;
    }

    /**
     * Gets the character information from a specific id from the selected item
     * @param id
     * @return
     * @throws IOException
     * @throws InterruptedException
     */
    public static CharacterDetails getCharacterDetailsFromRickAndMorty(String id) throws IOException, InterruptedException {
        String uri = "https://rickandmortyapi.com/api/character/"+id;

        //configure the environment to make a HTTP request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse
                .BodyHandlers
                .ofString());

        Gson gson = new Gson();
        return gson.fromJson(httpResponse.body(),CharacterDetails.class);
    }
    /**
     * This method will call the Rick and Morty API
     * and search for a specific character with a specific term
     */
    public static APIResponse  getCharacterFromRickAndMorty(String searchTerm) throws IOException, InterruptedException {
        searchTerm = searchTerm.replaceAll(" ","%20");
        String uri = "https://rickandmortyapi.com/api/character/?name="+searchTerm;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest= HttpRequest.newBuilder().uri(URI.create(uri)).build();

        HttpResponse<String> response = client.send(httpRequest,
                HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        return gson.fromJson(response.body(),APIResponse.class);
    }

}
