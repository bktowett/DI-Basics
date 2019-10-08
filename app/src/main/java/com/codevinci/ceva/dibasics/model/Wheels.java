package com.codevinci.ceva.dibasics.model;

import javax.inject.Inject;

public class Wheels {
    private Tires tires;
    private Rims rims;

    public Wheels(Tires tires, Rims rims) {
        this.rims = rims;
        this.tires = tires;
    }
}
