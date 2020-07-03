package com.homework.nix;

import com.homework.nix.data.*;
import com.homework.nix.service.impl.*;

public class Main {

    public static void main(String[] args) {
        PlanetReporterServiceImpl planetReporterServiceImpl = new PlanetReporterServiceImpl();

        planetReporterServiceImpl.printPlanetName(new MercuryServiceImpl(new Mercury()));
        planetReporterServiceImpl.printPlanetGravityAcceleration(new MercuryServiceImpl(new Mercury()));

        System.out.println();

        planetReporterServiceImpl.printPlanetName(new VenusServiceImpl(new Venus()));
        planetReporterServiceImpl.printPlanetGravityAcceleration(new VenusServiceImpl(new Venus()));

        System.out.println();

        planetReporterServiceImpl.printPlanetName(new EarthServiceImpl(new Earth()));
        planetReporterServiceImpl.printPlanetGravityAcceleration(new EarthServiceImpl(new Earth()));

        System.out.println();

        planetReporterServiceImpl.printPlanetName(new MarsServiceImpl(new Mars()));
        planetReporterServiceImpl.printPlanetGravityAcceleration(new MarsServiceImpl(new Mars()));

        System.out.println();

        planetReporterServiceImpl.printPlanetName(new JupiterServiceImpl(new Jupiter()));
        planetReporterServiceImpl.printPlanetGravityAcceleration(new JupiterServiceImpl(new Jupiter()));

        System.out.println();
        planetReporterServiceImpl.printPlanetName(new SaturnServiceImpl(new Saturn()));
        planetReporterServiceImpl.printPlanetGravityAcceleration(new SaturnServiceImpl(new Saturn()));

        System.out.println();

        planetReporterServiceImpl.printPlanetName(new UranusServiceImpl(new Uranus()));
        planetReporterServiceImpl.printPlanetGravityAcceleration(new UranusServiceImpl(new Uranus()));

        System.out.println();

        planetReporterServiceImpl.printPlanetName(new NeptuneServiceImpl(new Neptune()));
        planetReporterServiceImpl.printPlanetGravityAcceleration(new NeptuneServiceImpl(new Neptune()));
    }
}
