package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by mikael on 2016-12-13.
 */
public class SimulationServer {
    ServerSocket myServerSocket;
    boolean ServerOn = true;

    public SimulationServer()
    {
        try
        {
            myServerSocket = new ServerSocket(11111);
        }
        catch(IOException ioe)
        {
            System.out.println("Could not create server socket on port 11111");
            System.exit(-1);
        }

        while(ServerOn) {
            try
            {
                Socket clientSocket = myServerSocket.accept();
                SimulationClientThread simulationClientThread = new SimulationClientThread(clientSocket);

            }
            catch(IOException ioe)
            {
                System.out.println("Exception encountered on accept. Ignoring. Stack");
                ioe.printStackTrace();
            }
        }
        try
        {
            myServerSocket.close();
            System.out.println("Server Stopped");
        }
        catch(Exception ioe)
        {
            System.out.println("Problem stopping server socket");
            System.exit(-1);
        }
    }

    public static void main(String[] args) {
        new SimulationServer();
    }
}

