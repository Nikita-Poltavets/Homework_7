package com.homework.nix.service.impl;

import com.homework.nix.data.Earth;
import com.homework.nix.data.GravitationalConstant;
import com.homework.nix.service.PlanetService;

public class EarthServiceImpl implements PlanetService {

    private final Earth earth;

    public EarthServiceImpl(Earth earth){
        this.earth = earth;
    }

    @Override
    public double getPlanetGravityAcceleration() {
        double accelerationOfGravity, weightOfPlanet, radiusOfPlanet;

        weightOfPlanet = earth.getWeight();
        radiusOfPlanet = earth.getRadius();

        accelerationOfGravity = GravitationalConstant.getGravitationalConstant() * (weightOfPlanet / Math.pow(radiusOfPlanet, 2));

        return accelerationOfGravity;
    }

    @Override
    public String getPlanetName() {
        return earth.getEarthName();
    }
}
