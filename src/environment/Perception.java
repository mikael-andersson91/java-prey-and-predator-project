package environment;

import com.animals.Animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikael on 2016-12-15.
 */
public class Perception implements Serializable {
    List resources;
    List animals;

    public Perception(){
        resources = new ArrayList<Resource>();
        animals = new ArrayList<Animal>();
    }

    public Perception(List<Resource> resources, List<Animal> animals){
        this.resources = resources;
        this.animals = animals;
    }
}
