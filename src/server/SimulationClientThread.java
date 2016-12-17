package server;

import java.io.*;
import java.net.Socket;

/**
 * Created by mikael on 2016-12-13.
 */
public class SimulationClientThread extends Thread {
    Socket clientSocket;

    //private BufferedReader in;
    //private PrintWriter out;

    private ObjectInputStream in;
    private ObjectOutputStream out;

    public SimulationClientThread(Socket socket){
        super();
        clientSocket = socket;
        try {
            //in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            //out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            in = new ObjectInputStream(clientSocket.getInputStream());
            out = new ObjectOutputStream(clientSocket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
