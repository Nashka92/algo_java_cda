package interfaces;

public interface Renumerable {

    /**
     * Nombre standard d'heures travaillées pendant 1 mois
     * sans compter les arrêt maladie ect...
     */
    public static final int NOMBRE_HEURE_MENSUELLES_NORMAL = 151;

    /**
     * Paie un salarié en fonction de son taux horaire
     * @param heures double - Nombre d'heures travaillées
     */
    public void payer(double heures);

    /**
     * Paie un salarié en fonction de son taux horaire
     * sur une base de 151h
     */
    public void payer();
    public double getTauxHoraire();
    public double calculRenumerationHeureSup(double heuresTravaillees);
}
