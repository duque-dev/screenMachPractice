package com.alurapractice.screenmatch.principal;

import com.alurapractice.screenmatch.modelos.Title;
import com.alurapractice.screenmatch.modelos.TitleDTO;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de una pelicula: ");
        String clave = "ab4d2127";
        var busqueda = lectura.nextLine();
        String direccion = "https://www.omdbapi.com/?t="+busqueda+"&apikey="+clave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);


        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TitleDTO myTitleDTO = gson.fromJson(json, TitleDTO.class);
        System.out.println(myTitleDTO);

        Title myTitle = new Title(myTitleDTO);
        System.out.println("prueba" + myTitle);


    }

}
