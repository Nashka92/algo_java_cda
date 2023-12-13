package interfaces;

public class Cdi extends Collaborateur implements Renumerable {

    private double tauxHoraire;
    @Override
    public void payer(double heures) {
        System.out.println("Il a gagné: "+this.getTauxHoraire() * heures);
    }

    @Override
    public void payer() {
        System.out.println("Il a gagné: "+this.getTauxHoraire() * this.NOMBRE_HEURE_MENSUELLES_NORMAL);
    }

    @Override
    public double getTauxHoraire() {
        return this.tauxHoraire;
    }


    private void SetTauxHoraire(double nouveauTaux){
        this.tauxHoraire = nouveauTaux;
    }

    @Override
    public double calculRenumerationHeureSup(double heuresTravaillees) {
        System.out.println("calcul logique flemme");
        return 500;
    }
}
