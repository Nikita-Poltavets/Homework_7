package com.homework.nix.service.impl;

import com.homework.nix.data.GravitationalConstant;
import com.homework.nix.data.Jupiter;
import com.homework.nix.data.Venus;
import com.homework.nix.service.PlanetService;

public class JupiterServiceImpl implements PlanetService {

    private final Jupiter jupiter;

    public JupiterServiceImpl(Jupiter jupiter){
        this.jupiter = jupiter;
    }

    @Override
    public double getPlanetGravityAcceleration() {
        double accelerationOfGravity, weightOfPlanet, radiusOfPlanet;

        weightOfPlanet = jupiter.getWeight();
        radiusOfPlanet = jupiter.getRadius();

        accelerationOfGravity = GravitationalConstant.getGravitationalConstant() * (weightOfPlanet / Math.pow(radiusOfPlanet, 2));

        return accelerationOfGravity;
    }

    @Override
    public String getPlanetName() {
        return jupiter.getJupiterName();
    }
}
