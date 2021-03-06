package org.fasttrackit;

public class Vehicle {


    //static variable / class variable
   static int totalVehicleCount;





    //instance variables
    int racingNumber;
    String name;
    int maxSpeed;
    double mileage;
    String colour;
    double fuelLevel;
    boolean damaged;
    double totalDistance;

    public Vehicle() {
        totalVehicleCount++;

    }



    public double accelerate(double speed, double durationInHours) {
        if (fuelLevel <= 0 ){
            System.out.println("Not enough fuel");
            return 0;
        }

        if (speed > maxSpeed) {
            System.out.println("Max speed exceeded!");
            return 0;
        } else if(speed == maxSpeed) {
            System.out.println("Be careful! Max speed reached!");

        } else {
            System.out.println("Valid speed entered");
        }

        double mileageMultiplier =1;
        if (speed > 120) {
            mileageMultiplier = speed / 100;
        }



        System.out.println(name + "is accelerating with " + speed + "km/ for " + durationInHours + "h");

        //local variable
        double traveledDistance = speed * durationInHours;

        System.out.println("Traveled distance: " + traveledDistance);

        totalDistance += traveledDistance;

        System.out.println("Total traveled distance: " + totalDistance);

        double usedFuel = traveledDistance * mileage / 100;

        usedFuel *= mileageMultiplier;

        fuelLevel = fuelLevel - usedFuel;
        // same result as the instruction above
        //fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);


            return traveledDistance;




    }

    }

