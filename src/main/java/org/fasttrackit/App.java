package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to the racing game!");

        Car carReference = new Car();
        carReference.name = "Audi";
        carReference.colour ="red";
        carReference.maxSpeed = 260;
        carReference.mileage = 6.2;

        //concatenation = lipirea mai multor stringuri
        System.out.println("Properties of" + carReference.name
        );

        System.out.println("The colour is " + carReference.colour);

        System.out.println("The max speed is " + carReference.maxSpeed);

        System.out.println("The kilometers is " + carReference.mileage);

        System.out.println("Fuel level: " + carReference.fuelLevel);

        System.out.println("Racing number: " + carReference.racingNumber);

        System.out.println("Damaged: " + carReference.damaged) ;

        carReference = null;

        Car car2 = new Car ();
        car2.name = "Lambourghini";
        car2.damaged = true;

        System.out.println("Proprietes of " + car2.name);
        System.out.println("Colour " + car2.colour);
        System.out.println("Damage "+ car2.damaged);













    }
}
