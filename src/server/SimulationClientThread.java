package server;

import java.io.*;
import java.net.Socket;

/**
 * Created by mikael on 2016-12-13.
 */
public class SimulationClientThread extends Thread {
    Socket clientSocket;

    private BufferedReader in;
    private PrintWriter out;

    public SimulationClientThread(Socket socket){
        super();
        clientSocket = socket;
        try {
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
