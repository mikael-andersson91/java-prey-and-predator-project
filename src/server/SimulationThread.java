package server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mikael on 2016-12-15.
 * Här körs simuleringen!
 */
public class SimulationThread extends Thread {
    private List<SimulationClientThread> clientThreadList;
    private int randomSeed;
    private double spawnRadius;


    public SimulationThread() {
        clientThreadList = Collections.synchronizedList(new ArrayList<SimulationClientThread>());
    }

    public void addToClientThreadList(SimulationClientThread simulationClientThread){
        synchronized (clientThreadList) {
            clientThreadList.add(simulationClientThread);
        }
    }
}
