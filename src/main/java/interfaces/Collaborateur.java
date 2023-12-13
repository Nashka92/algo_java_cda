package interfaces;

import java.time.LocalDate;

public abstract class Collaborateur implements Personne {
    protected String nom;
    protected String prenom;

    public LocalDate getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(LocalDate dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public LocalDate getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(LocalDate dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    protected LocalDate dateDebutContrat;
    protected LocalDate dateFinContrat;


    @Override
    public String getNom() {
        return null;
    }

    @Override
    public String getPrenom() {
        return null;
    }

    @Override
    public String getNomComplet() {
        return null;
    }

    @Override
    public void setNom(String nouveauNom) {
        this.nom = nom;
    }

    @Override
    public void setPrenom(String nouveauPrenom) {
        this.nom = prenom;
    }

    public void licencier(LocalDate dateDeFin) {
        this.dateFinContrat = dateDeFin;
        System.out.println(this.nom + this.prenom + "est viré. LOL");
    }

    /**
     * Le collaborateur travaille
     */
    public void travailler(){
        System.out.println(this.getNom() + " " + this.getPrenom() + " est en train de travailler");
    }

    /**
     * Vérifie si le collaborateur est dans les effectifs
     * @return
     */
    protected boolean estDansLesEffectifs(){
        return(this.dateFinContrat != null && this.dateFinContrat.isBefore(LocalDate.now()));
    }

}
