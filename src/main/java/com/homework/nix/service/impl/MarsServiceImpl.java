package com.homework.nix.service.impl;

import com.homework.nix.data.GravitationalConstant;
import com.homework.nix.data.Mars;
import com.homework.nix.service.PlanetService;

public class MarsServiceImpl implements PlanetService {

    private final Mars mars;

    public MarsServiceImpl(Mars mars){
        this.mars = mars;
    }

    @Override
    public double getPlanetGravityAcceleration() {
        double accelerationOfGravity, weightOfPlanet, radiusOfPlanet;

        weightOfPlanet = mars.getWeight();
        radiusOfPlanet = mars.getRadius();

        accelerationOfGravity = GravitationalConstant.getGravitationalConstant() * (weightOfPlanet / Math.pow(radiusOfPlanet, 2));

        return accelerationOfGravity;
    }

    @Override
    public String getPlanetName() {
        return mars.getMarsName();
    }
}
