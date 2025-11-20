package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        // On préserve la description originale et on ajoute " - En ligne"
        String base = coursDecorated.getDescription();
        return base + " - En ligne";
    }

    @Override
    public double getDuree() {
        // Même durée que le cours de base
        return coursDecorated.getDuree();
    }
}
