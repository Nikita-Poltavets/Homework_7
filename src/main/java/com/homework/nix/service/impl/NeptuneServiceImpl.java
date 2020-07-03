package com.homework.nix.service.impl;

import com.homework.nix.data.Earth;
import com.homework.nix.data.GravitationalConstant;
import com.homework.nix.data.Neptune;
import com.homework.nix.service.PlanetService;

public class NeptuneServiceImpl implements PlanetService {

    private final Neptune neptune;

    public NeptuneServiceImpl(Neptune neptune){
        this.neptune = neptune;
    }

    @Override
    public double getPlanetGravityAcceleration() {
        double accelerationOfGravity, weightOfPlanet, radiusOfPlanet;

        weightOfPlanet = neptune.getWeight();
        radiusOfPlanet = neptune.getRadius();

        accelerationOfGravity = GravitationalConstant.getGravitationalConstant() * (weightOfPlanet / Math.pow(radiusOfPlanet, 2));

        return accelerationOfGravity;
    }

    @Override
    public String getPlanetName() {
        return neptune.getNeptuneName();
    }
}
