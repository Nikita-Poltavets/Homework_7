package com.homework.nix.service.impl;

import com.homework.nix.data.GravitationalConstant;
import com.homework.nix.data.Mercury;
import com.homework.nix.service.PlanetService;

public class MercuryServiceImpl implements PlanetService {

    private final Mercury mercury;

    public MercuryServiceImpl(Mercury mercury){
        this.mercury = mercury;
    }

    @Override
    public double getPlanetGravityAcceleration() {
        double accelerationOfGravity, weightOfPlanet, radiusOfPlanet;

        weightOfPlanet = mercury.getWeight();
        radiusOfPlanet = mercury.getRadius();

        accelerationOfGravity = GravitationalConstant.getGravitationalConstant() * (weightOfPlanet / Math.pow(radiusOfPlanet, 2));

        return accelerationOfGravity;
    }

    @Override
    public String getPlanetName() {
        return mercury.getMercuryName();
    }
}
