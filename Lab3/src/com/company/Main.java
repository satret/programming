package com.company;

import com.company.Character.*;
import com.company.enums.CrystalSize;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cube cube = new Cube();
        Cog cog = new Cog();
        Spuntick spuntick = new Spuntick();
        Rover rover = new Rover();
        Pilyulkin pilyulkin = new Pilyulkin();
        Tube tube = new Tube();
        Researcher researcher = new Researcher();
        Crystal Antilunit = new Crystal();
        Crystal Antilunit1 = new Crystal();
        Shorty shorty = new Shorty();
        Fuchsia fuchsia = new Fuchsia();
        Herring herring = new Herring();
        Sleepwalker sleepwalker = new Sleepwalker();
        Znayka znayka = new Znayka();
        Neznayka neznayka = new Neznayka();
        Rover.Boilcistern boilcistern = new Rover.Boilcistern();
        Rover.Drill drill = new Rover.Drill();
        Rover.Washingmachine washingmachine = new Rover.Washingmachine();

        Rover.Plough plough = new Rover.Plough();
        Rover.Pump pump = new Rover.Pump();
        Rover.AirConditioning airConditioning = new Rover.AirConditioning();
        Rover.Dinamo dinamo = new Rover.Dinamo();
        Rover.RadioStation radioStation = new Rover.RadioStation();
        Rover.DitchDigger ditchdigger = new Rover.DitchDigger();
        Rover.VacuumCleaner vacuumcleaner = new Rover.VacuumCleaner();

        cube.start(cube);
        cog.build(cog, spuntick, rover);
        cog.wakeup(cog, spuntick, rover);
        cog.work(cog, spuntick);
        cog.rapair(cog, spuntick, znayka, sleepwalker);
        boilcistern.function(rover);
        drill.function(rover);
        washingmachine.function(rover);
        plough.function(rover);
        pump.function(rover);
        airConditioning.function(rover);
        dinamo.function(rover);
        radioStation.function(rover);
        ditchdigger.function(rover);
        vacuumcleaner.function(rover);

        researcher.employment(znayka, fuchsia, herring, Antilunit);
        researcher.discovery(znayka, fuchsia, herring, Antilunit);
        researcher.discovery2(znayka, fuchsia, Antilunit);
        researcher.experiment(Antilunit);
        shorty.savemg(Antilunit);
        fuchsia.sayhardphysics();
        researcher.detect(znayka, fuchsia, herring, shorty);
        researcher.popal(sleepwalker);
        sleepwalker.fly(sleepwalker);
        znayka.off(znayka);
        sleepwalker.fell(sleepwalker, pilyulkin, tube);
        pilyulkin.spirt(pilyulkin, sleepwalker);
        sleepwalker.paper(sleepwalker, pilyulkin, neznayka);
        sleepwalker.say(sleepwalker);
    }
}