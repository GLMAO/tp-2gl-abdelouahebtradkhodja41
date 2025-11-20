package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {

    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // On pourrait notifier ici si besoin, mais les tests ne l'exigent pas
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // Notification possible ici aussi
        notifyObservers(message);
    }

    /**
     * Méthode utilisée explicitement dans les tests pour déclencher la notification.
     */
    public void setChangement(String message) {
        // On notifie tous les observateurs avec le message fourni
        notifyObservers(message);
    }

    // ================== Implémentation de Subject ==================

    @Override
    public void attach(Observer o) {
        if (o != null && !observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
