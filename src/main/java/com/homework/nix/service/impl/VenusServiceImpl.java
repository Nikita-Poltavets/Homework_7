package com.homework.nix.service.impl;

import com.homework.nix.data.GravitationalConstant;
import com.homework.nix.data.Venus;
import com.homework.nix.service.PlanetService;

public class VenusServiceImpl implements PlanetService {

    private final Venus venus;

    public VenusServiceImpl(Venus venus){
        this.venus = venus;
    }

    @Override
    public double getPlanetGravityAcceleration() {
        double accelerationOfGravity, weightOfPlanet, radiusOfPlanet;

        weightOfPlanet = venus.getWeight();
        radiusOfPlanet = venus.getRadius();

        accelerationOfGravity = GravitationalConstant.getGravitationalConstant() * (weightOfPlanet / Math.pow(radiusOfPlanet, 2));

        return accelerationOfGravity;
    }

    @Override
    public String getPlanetName() {
        return venus.getVenusName();
    }
}
