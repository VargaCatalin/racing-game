package org.fasttrackit;

public class AutoVehicle extends Vehicle{

    // has-a "relationship / Aggregation
    Engine engine;
    String demo;


    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
}
