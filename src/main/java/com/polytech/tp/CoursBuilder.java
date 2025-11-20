package com.polytech.tp;

/**
 * Implémentation du pattern Builder pour la classe Cours.
 */
public class CoursBuilder {

    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;

    public CoursBuilder() {
        // Valeurs par défaut possibles
        this.salle = "";
        this.date = "";
        this.heureDebut = "";
        this.estOptionnel = false;
        this.niveau = "";
        this.necessiteProjecteur = false;
    }

    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }

    public CoursBuilder setEstOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }

    public Cours build() {
        // build() ne doit jamais retourner null
        Cours cours = new Cours(
                matiere,
                enseignant,
                salle,
                date,
                heureDebut,
                estOptionnel,
                niveau,
                necessiteProjecteur
        );
        return cours;
    }
}
