package ru.dolgosheev.http.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketRunner {

    public static void main(String[] args) throws IOException {
//        http - 80
//        https - 443
//        tcp
        try (var socket = new Socket("google.com", 80);
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var inputStream = new DataInputStream(socket.getInputStream())) {
            outputStream.writeUTF("Hello world!");
            var response = inputStream.readAllBytes();
            System.out.println(response.length);
        }
    }
}
