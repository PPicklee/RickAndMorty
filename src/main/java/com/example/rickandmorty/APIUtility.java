package com.example.rickandmorty;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.nio.file.Path;

public class APIUtility {
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

    /**
     * This method will read the jsonData.json from the root
     * of the project and create an APIResponse object
     */
    public static APIResponse getCharacterFromJsonFile()
    {
        //create a GSON object
        Gson gson = new Gson();
        APIResponse apiResponse = null;

        //try with resource
        try(
                //jsonreader object to json file
                FileReader fileReader = new FileReader("jsonData.json");
                JsonReader jsonReader = new JsonReader(fileReader);
                )
        {
            //this is type json to be converted
            apiResponse = gson.fromJson(jsonReader, APIResponse.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return apiResponse;
    }

}
