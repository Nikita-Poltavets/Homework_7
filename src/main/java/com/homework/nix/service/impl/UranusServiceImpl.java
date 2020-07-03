package com.homework.nix.service.impl;

import com.homework.nix.data.GravitationalConstant;
import com.homework.nix.data.Uranus;
import com.homework.nix.service.PlanetService;

public class UranusServiceImpl implements PlanetService {

    private final Uranus uranus;

    public UranusServiceImpl(Uranus uranus){
        this.uranus = uranus;
    }

    @Override
    public double getPlanetGravityAcceleration() {
        double accelerationOfGravity, weightOfPlanet, radiusOfPlanet;

        weightOfPlanet = uranus.getWeight();
        radiusOfPlanet = uranus.getRadius();

        accelerationOfGravity = GravitationalConstant.getGravitationalConstant() * (weightOfPlanet / Math.pow(radiusOfPlanet, 2));

        return accelerationOfGravity;
    }

    @Override
    public String getPlanetName() {
        return uranus.getUranusName();
    }
}
