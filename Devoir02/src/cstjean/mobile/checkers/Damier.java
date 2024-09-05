package cstjean.mobile.checkers;

import java.util.HashMap;
import java.util.Map;

public class Damier {
    private Map<Integer, Pion> pions;
    private static final int TAILLE_DAMIER = 50;

    public Damier() {
        pions = new HashMap<>();
    }

    public void ajouterPion(int position, Pion pion) {
        if (position < 1 || position > TAILLE_DAMIER) {
            throw new IllegalArgumentException("Position invalide");
        }
        pions.put(position, pion);
    }

    public Pion obtenirPion(int position) {
        if (position < 1 || position > TAILLE_DAMIER) {
            throw new IllegalArgumentException("Position invalide");
        }
        return pions.get(position);
    }

    public int getNombreDePions() {
        return pions.size();
    }
}

