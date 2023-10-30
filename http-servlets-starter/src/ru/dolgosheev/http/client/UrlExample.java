package ru.dolgosheev.http.client;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlExample {

    public static void main(String[] args) throws IOException {
        var url = new URL("file:C:\\_java\\http_servlets_Udemy_D.Matveyenka\\http-servlets-starter\\src\\ru\\dolgosheev\\http\\socket\\DatagramRunner.java");
        var urlConnection = url.openConnection();

        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));
    }

    private static void checkGoogle() throws IOException {
        var url = new URL("https:\\google.com");
        var urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);

        try (var outputStream = urlConnection.getOutputStream()) {
        }

        System.out.println();
    }
}
