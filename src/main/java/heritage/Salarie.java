package heritage;

import java.time.LocalDate;

public class Salarie extends Personne {
    public static final int HEURES_TRAVAILLEES_MENSUELLES_NORMALES = 151;
    private double tauxHoraireBrut;
    private LocalDate debutContrat;
    private LocalDate finContrat;

    public Salarie(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            double tauxHoraireBrut,
            LocalDate debutContrat
    ) {
        //on hérite le constructor du parent, pas besoin de faire l'initialisation avec le this pour le parent
        // le super fait le taff
        super(nom,prenom,dateNaissance);
        this.debutContrat = debutContrat;
        this.tauxHoraireBrut = tauxHoraireBrut;
    }

    public double getTauxHoraireBrut() {
        return tauxHoraireBrut;
    }

    public void setTauxHoraireBrut(double tauxHoraireBrut) {
        if (tauxHoraireBrut < 20) {
            throw new IllegalArgumentException(
                    "M'enfin Corinne ! les calculs sont pas bons ! "
            );
        }
        this.tauxHoraireBrut = tauxHoraireBrut;
    }

    public LocalDate getDebutContrat() {
        return debutContrat;
    }

    public void setDebutContrat(LocalDate debutContrat) {
        this.debutContrat = debutContrat;
    }

    public LocalDate getFinContrat() throws Exception {
         if (finContrat == null){
             throw new Exception("le salarié n'est pas licencié !");
         } else {
         return this.finContrat;
         }
    }

    public void setFinContrat(LocalDate finContrat) {
        this.finContrat = finContrat;
    }

    /**
     * Paie le salarié en fonction du temps passé à travailler
     * @param heuresTravaillees double - Nombre d'heures
     * @return ca retourne le salaire !
     */
    public double payerSalaireMensuelBrut(double heuresTravaillees){
        if(heuresTravaillees < 0){
            throw new IllegalArgumentException("WTF Corinne ?!");
        }

        if (estLicencie()) {
            throw new IllegalArgumentException("Le gars est viré!");
        }
        return calculerSalaire(heuresTravaillees);
    }

    /**
     * Calcule le salaire en fonction du temps travaillé
     * Applique un taux spécifique aux heures effectuées au-delà de 151h
     * @param heuresTravaillees double - Nombre d'heures travaillées
     * @return double - Le salaire !
     */

    private double calculerSalaire(double heuresTravaillees) {
        if (heuresTravaillees > HEURES_TRAVAILLEES_MENSUELLES_NORMALES) {
            double salaire = 0;
            salaire += HEURES_TRAVAILLEES_MENSUELLES_NORMALES * this.tauxHoraireBrut;
            salaire += (heuresTravaillees - HEURES_TRAVAILLEES_MENSUELLES_NORMALES) * this.tauxHoraireBrut;

            return salaire;
        } else {
            return heuresTravaillees * this.tauxHoraireBrut;
        }
    }

    /**
     * Vérifie si le salarié n'est plus présent dans la boîte
     * @return Vrai si le salarié n'est plus dans les effectifs
     */
    private boolean estLicencie() {
        return this.finContrat != null && finContrat.isBefore(LocalDate.now());
    }

    //surcharge
    public double payerSalaireMensuelBrut(){
        return this.payerSalaireMensuelBrut(HEURES_TRAVAILLEES_MENSUELLES_NORMALES);
    }

    public void travailler(){
        System.out.println(this.nom + this.prenom + "travaille dur car il aimerait bien une augmentation");
    }

    public void licencier(LocalDate dateDeFin){
        this.finContrat =  dateDeFin;
        System.out.println(this.nom + this.prenom + "Titouan est viré, LOL !");
    }

    @Override
    public String toString(){
        return "Le salarié s'appelle " + this.nom + ' ' + this.prenom;
    }
}
