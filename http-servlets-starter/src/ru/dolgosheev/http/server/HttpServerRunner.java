package ru.dolgosheev.http.server;

public class HttpServerRunner {

    public static void main(String[] args) {
        var httpServer = new HttpServer(9000);
        httpServer.run();
    }
}
