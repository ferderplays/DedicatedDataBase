package net.ferderplays.ddb.utils.actions;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Connector {

    //connects your website to a databse server
    public static void connectToServer(String host, int port) {
        try {
            Socket socket = new Socket(host, port);
            OutputStream output = socket.getOutputStream();
            InputStream input = socket.getInputStream();
            output.flush();
            output.close();
            input.close();
            socket.close();
            createDBFileInServer(socket);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void createDBFileInServer(Socket socket) {
    }
}