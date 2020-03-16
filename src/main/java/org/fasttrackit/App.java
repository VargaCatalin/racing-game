package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Game game = new Game();
        game.start();


        System.out.println("Please enter vehicle name:");
        Scanner scanner = new Scanner(System.in);
        String vechileName = scanner.nextLine();

        System.out.println("Entered name: " + vechileName);



            System.out.println("Welcome to the racing game!");

            Car carReference = new Car();
            carReference.name = "Audi";
            carReference.colour = "red";
            carReference.maxSpeed = 260;
            carReference.mileage = 6.2;
            carReference.fuelLevel = 100;
            carReference.damaged = true;


//        carReference.engine - new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 2000;

            Engine engine1 = new Engine();
            engine1.manufacturer = "VW";
            engine1.capacity = 2000;

            carReference.engine = engine1;
            double currentDistance = carReference.accelerate(60, 1);

            System.out.println("Current distance: " + currentDistance);

            Mechanic mechanic = new Mechanic();
            mechanic.repair(carReference);

            System.out.println("Is car damaged? " + carReference.damaged);

            // One object with two references

            System.out.println("Engine details");
            System.out.println(engine1.capacity);
            System.out.println(carReference.engine.capacity);

            engine1.capacity = 2100;

            System.out.println("Update Engine details");
            System.out.println(engine1.capacity);
            System.out.println(carReference.engine.capacity);


            //concatenation = lipirea mai multor stringuri
            System.out.println("Properties of " + carReference.name
            );

            System.out.println("The colour is " + carReference.colour);

            System.out.println("The max speed is " + carReference.maxSpeed);

            System.out.println("The kilometers is " + carReference.mileage);

            System.out.println("Fuel level: " + carReference.fuelLevel);

            System.out.println("Racing number: " + carReference.racingNumber);

            System.out.println("Damaged: " + carReference.damaged);

//        carReference = null;

            Car car2 = new Car();
            car2.name = "Lambourghini";
            car2.damaged = true;

            System.out.println("Proprietes of  " + car2.name);
            System.out.println("Colour " + car2.colour);
            System.out.println("Damage " + car2.damaged);

            //modulo %  operation
//        System.out.println(4 % 2);
//        System.out.println(4 % 2 == 0);
//        System.out.println(4 % 3);


        }

    }

