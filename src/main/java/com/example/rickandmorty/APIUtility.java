package com.example.rickandmorty;

import java.io.IOException;
import java.net.URI;

public class APIUtility {


    private String/*Character[]*/ search;

    private String totalResults;

    private String response;

    private String error;

    //public static APIResponse getSingleCharacter(String name) throws IOException, InterruptedException {
    search = search.replaceAll(" ", "%20");//replace blank spaces

    String uri = "https://rickandmortyapi.com/api"+search;

}
