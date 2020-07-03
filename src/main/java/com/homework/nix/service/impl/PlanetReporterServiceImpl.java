package com.homework.nix.service.impl;

import com.homework.nix.service.PlanetReporterService;
import com.homework.nix.service.PlanetService;

public class PlanetReporterServiceImpl implements PlanetReporterService {

    @Override
    public void printPlanetGravityAcceleration(PlanetService planet){

        System.out.println("Planet Gravity Acceleration - " + planet.getPlanetGravityAcceleration());
    }

    @Override
    public void printPlanetName(PlanetService planet){

        System.out.println("Planet name - " + planet.getPlanetName());
    }

}
