package com.polytech.tp;

public class Cours implements ICours {

    private String matiere;
    private String enseignant;
    private String salle;
    private String date;
    private String heureDebut;
    private boolean estOptionnel;
    private String niveau;
    private boolean necessiteProjecteur;

    public Cours(String matiere, String enseignant, String salle, String date,
                 String heureDebut, boolean estOptionnel, String niveau, boolean necessiteProjecteur) {
        this.matiere = matiere;
        this.enseignant = enseignant;
        this.salle = salle;
        this.date = date;
        this.heureDebut = heureDebut;
        this.estOptionnel = estOptionnel;
        this.niveau = niveau;
        this.necessiteProjecteur = necessiteProjecteur;
    }

    @Override
    public String getDescription() {
        return "Cours de " + matiere + " avec " + enseignant + " (" + salle + ")";
    }

    @Override
    public double getDuree() {
        return 1.5;
    }

    public String getMatiere() {
        return matiere;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public String getSalle() {
        return salle;
    }

    public String getDate() {
        return date;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public boolean isEstOptionnel() {
        return estOptionnel;
    }

    public String getNiveau() {
        return niveau;
    }

    public boolean isNecessiteProjecteur() {
        return necessiteProjecteur;
    }

    // Setters utilisés par le Builder (package-private ou public)
    void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }

    void setSalle(String salle) {
        this.salle = salle;
    }

    void setDate(String date) {
        this.date = date;
    }

    void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    void setEstOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
    }

    void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    void setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
    }
}
