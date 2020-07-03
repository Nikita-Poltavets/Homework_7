package com.homework.nix.service.impl;

import com.homework.nix.data.Earth;
import com.homework.nix.data.GravitationalConstant;
import com.homework.nix.data.Saturn;
import com.homework.nix.service.PlanetService;

public class SaturnServiceImpl implements PlanetService {

    private final Saturn saturn;

    public SaturnServiceImpl(Saturn saturn){
        this.saturn = saturn;
    }

    @Override
    public double getPlanetGravityAcceleration() {
        double accelerationOfGravity, weightOfPlanet, radiusOfPlanet;

        weightOfPlanet = saturn.getWeight();
        radiusOfPlanet = saturn.getRadius();

        accelerationOfGravity = GravitationalConstant.getGravitationalConstant() * (weightOfPlanet / Math.pow(radiusOfPlanet, 2));

        return accelerationOfGravity;
    }

    @Override
    public String getPlanetName() {
        return saturn.getSaturnName();
    }
}
